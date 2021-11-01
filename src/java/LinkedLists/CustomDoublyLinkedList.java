/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 * Use this class for a doubly linked list
 * @author Matthew Gerlach
 */
public class CustomDoublyLinkedList extends CustomLinkedList {
    protected CustomNode tail;
    
    @Override
    public void insertAtHead(Object o) {
        super.insertAtHead(o);
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }else{
            tail = newNode;
        }
    }

    @Override
    public void insertAtTail(Object o) {
        //super.insertAtTail(o);
        newNode = new CustomNode(o);
        if(tail != null){
            tail.next = newNode;
            tail.prev = tail;
        }
        
        tail = newNode;
    }

    @Override
    public void insertAtIndex(int index, Object o) throws Exception {
        super.insertAtIndex(index, o);
        newNode.prev = currentNode;
        if(newNode.next != null){
            newNode.next.prev = currentNode;
        }
        
        
        if(index == size - 1){
            tail = newNode;
        }
    }

    @Override
    public void deleteFromIndex(int index) throws Exception {
        super.deleteFromIndex(index);
        if(currentNode.next != null){
            currentNode.next.prev = currentNode;
        }
        
    }
    
    /**
     * Reverse traverse of the linked list
     * @return 
     */
    public Object getPrev(){
        if(currentNode == null){
            currentNode = tail;
        }else{
            currentNode = currentNode.prev;
        }
        
        if(currentNode == null){
            return null;
        }else{
            return currentNode.o;
        }
    }
}
