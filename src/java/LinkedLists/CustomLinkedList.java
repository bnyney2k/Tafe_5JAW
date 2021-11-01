/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

/**
 * Use this class for a single linked list
 *
 * @author Matthew Gerlach
 */
public class CustomLinkedList {

    class CustomNode {
        //The object in the current node
        Object o;
        //The pointer to the next node in a CustomLinkedList
        CustomNode next = null;
        CustomNode prev = null;

        public CustomNode(Object o) {
            this.o = o;
        }
    }

    static final String ERROR_INDEX_TOO_HIGH = "Index is too high";

    /**
     *
     */
    protected CustomNode head;
    //The current node or new node being worked on. Required to extend this class
    //to doubly linked list so to not repeat code
    protected CustomNode currentNode, newNode;
    protected int size = 0;

    /**
     * Insert a new object at the end of the linked list
     *
     * @param o
     */
    public void insertAtTail(Object o) {
        //Create a new node
        newNode = new CustomNode(o);
        //If the head is null, then there is nothing in the list so the
        //head will become this node
        if (head == null) {
            head = newNode;
        } else {
            //Create a temporary node to loop through until we find the tail
            currentNode = head;
            //Move through each node until we find the tail. The tail will have
            //a null 'next' node. That's how we know it is the tail.
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            //Set the 'next' node of the current tail node as the new node
            currentNode.next = newNode;
        }

        size++;
    }
    
    public Object getNext(){
        if(currentNode == null){
            currentNode = head;
        }else{
            currentNode = currentNode.next;
        }
        
        return currentNode.o;
    }

    /**
     * Insert a new object at the beginning of the linked list
     *
     * @param o
     */
    public void insertAtHead(Object o) {
        //Create the new node
        newNode = new CustomNode(o);
        //Set the current head as now the next of the new node
        if(head != null){
            newNode.next = head;
        }
        
        //Set the new node as the head
        head = newNode;

        size++;
    }

    /**
     * Insert a new object at the specified index of the linked list
     *
     * @param index
     * @param o
     * @throws java.lang.Exception
     */
    public void insertAtIndex(int index, Object o) throws Exception {
        if (index <= size + 1) {
            //If index is 0 then we just use insertAtHead(o)
            if (index == 0) {
                insertAtHead(o);
            } else {
                //Create a new node
                newNode = new CustomNode(o);
                //Set the current scannable node as the head
                currentNode = head;
                //Loop through the list until we find the index we are looking for
                for (int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.next;
                }
                //Set the current node as the next node after the new one
                newNode.next = currentNode.next;
                //Insert the new node
                currentNode.next = newNode;

                size++;
            }
        } else {
            throw new Exception(ERROR_INDEX_TOO_HIGH);
        }
    }

    /**
     * Delete an object from the specified index of the linked list
     *
     * @param index
     * @throws java.lang.Exception
     */
    public void deleteFromIndex(int index) throws Exception {
        if (index < size) {
            //If the index is 0, then just set the head as the current head's next
            if (index == 0) {
                head = head.next;
            } else {
                //Create a scannable node starting from the head
                currentNode = head;
                //Loop through the list until we find the node at the specified
                //index
                for (int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.next;
                }
                //Set the next node as the one after
                currentNode.next = currentNode.next.next;
            }
        } else {
            throw new Exception(ERROR_INDEX_TOO_HIGH);
        }
    }

    public Object getFromIndex(int index) throws Exception {
        if (index < size) {
            if (index == 0) {
                return head.o;
            }

            currentNode = head;

            for (int i = 0; i <= index; i++) {
                
                
                System.out.println("i = " + i + ", index = " + index + ", o = " + currentNode.o);

                if (i == index) {
                    return currentNode.o;
                }
                
                currentNode = currentNode.next;
            }
            //If not in the index
            return null;
        } else {
            throw new Exception(ERROR_INDEX_TOO_HIGH);
        }
    }

    public int getSize() {
        return size;
    }
    
    public void resetIndex(){
        currentNode = null;
        newNode = null;
    }
}
