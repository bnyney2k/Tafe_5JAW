/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * A Custom binary tree
 * @author Matthew Gerlach
 */
public class CustomBinaryTree {

    class Node {

        Object o;
        Node left;
        Node right;

        Node(Object o) {
            this.o = o;
            left = null;
            right = null;
        }
    }

    Node root;

    /**
     * Private method to find the location in the BTree to insert the object
     *
     * @param currentNode
     * @param o
     * @return
     */
    private Node insertRecursive(Node currentNode, Object o) {
        if (currentNode == null) {
            return new Node(o);
        }

        if (o.hashCode() < currentNode.o.hashCode()) {
            currentNode.left = insertRecursive(currentNode.left, o);
        } else if (o.hashCode() > currentNode.o.hashCode()) {
            currentNode.right = insertRecursive(currentNode.right, o);
        } else {
            return currentNode;
        }

        return currentNode;
    }

    /**
     * Public method to add object to the BTree
     *
     * @param o
     */
    public void add(Object o) {
        root = insertRecursive(root, o);
    }

    /**
     * Private method to find the node with the requested object and return it
     *
     * @param currentNode
     * @param o
     * @return
     */
    private Object findRecursive(Node currentNode, Object o) {
        if (currentNode == null) {
            return null;
        }

        if (o.equals(currentNode.o)) {
            return o;
        }

        return o.hashCode() < currentNode.o.hashCode()
                ? findRecursive(currentNode.left, o)
                : findRecursive(currentNode.right, o);
    }

    /**
     * Public method to find an object in the BTree
     *
     * @param o
     * @return
     */
    public Object find(Object o) {
        return findRecursive(root, o);
    }

    /**
     * Private method to find the node to delete from the BTree. We need to
     * consider several factors here. Such as if the node to delete has 0, 1 or
     * 2 leaf nodes, and how to delete the object from the BTree depends on this
     *
     * @param currentNode
     * @param o
     * @return
     */
    private Node deleteRecursive(Node currentNode, Object o) {
        if (currentNode == null) {
            return null;
        }

        //If the value is found, we can now perform the node deletion
        if (currentNode.o.equals(o)) {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            }

            if (currentNode.left == null) {
                return currentNode.right;
            }

            if (currentNode.right == null) {
                return currentNode.left;
            }

            Node lowestNode = findNodeWithLowestHashCode(currentNode.right);
            currentNode.o = lowestNode.o;
            currentNode.right = deleteRecursive(currentNode.right, lowestNode.o);
            return currentNode;
        }

        if (o.hashCode() < currentNode.o.hashCode()) {
            currentNode.left = deleteRecursive(currentNode.left, o);
            return currentNode;
        }

        currentNode.right = deleteRecursive(currentNode.right, o);
        return currentNode;
    }

    /**
     * Finds the node in the tree from a specified node that contains the object
     * with the lowest hash code
     *
     * @param leftNode
     * @return
     */
    private Node findNodeWithLowestHashCode(Node leftNode) {
        return leftNode.left == null ? leftNode : findNodeWithLowestHashCode(leftNode.left);
    }

    /**
     * Public method to delete an object from the BTree
     * @param o 
     */
    public void delete(Object o) {
        root = deleteRecursive(root, o);
    }

    /**
     * Returns a List of Objects in order
     * @param node
     * @param list 
     */
    public void getObjectList_InOrder(Node node, List<Object> list) {
        if(list == null){
            list = new ArrayList();
        }
        
        if (node != null) {
            getObjectList_InOrder(node.left, list);
            list.add(node.o);
            getObjectList_InOrder(node.right, list);
        }
    }

    /**
     * Returns a List of Objects in pre-order
     * @param node
     * @param list 
     */
    public List<Object> getObjectList_PreOrder(Node node, List<Object> list) {
        if(list == null){
            list = new ArrayList();
        }
        
        if (node != null) {
            getObjectList_PreOrder(node.left, list);
            list.add(node.o);
            getObjectList_PreOrder(node.right, list);
        }
        
        return list;
    }
    
    /**
     * Returns a List of Objects in post-order
     * @param node
     * @param list 
     */
    public List<Object> getObjectList_PostOrder(Node node, List<Object> list) {
        if(list == null){
            list = new ArrayList();
        }
        
        if (node != null) {
            getObjectList_PreOrder(node.left, list);
            getObjectList_PreOrder(node.right, list);
            list.add(node.o);
        }
        
        return list;
    }

}
