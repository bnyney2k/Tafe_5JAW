/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import Classes.Address;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CustomDoublyLinkedListTest {
    
    public CustomDoublyLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertAtHead method, of class CustomDoublyLinkedList.
     */
    @Test
    public void testInsertAtHead() {
        System.out.println("insertAtHead");
        Object o = new Address();
        Object o2 = new Address();
        CustomDoublyLinkedList instance = new CustomDoublyLinkedList();
        instance.insertAtHead(o);
        instance.insertAtHead(o2);
    }

    /**
     * Test of insertAtTail method, of class CustomDoublyLinkedList.
     */
    @Test
    public void testInsertAtTail() {
        System.out.println("insertAtTail");
        Object o = new Address();
        Object o2 = new Address();
        Object o3 = new Address();
        CustomDoublyLinkedList instance = new CustomDoublyLinkedList();
        instance.insertAtHead(o);
        instance.insertAtHead(o2);
        instance.insertAtTail(o3);
    }

    /**
     * Test of insertAtIndex method, of class CustomDoublyLinkedList.
     */
    @Test
    public void testInsertAtIndex() throws Exception {
        System.out.println("insertAtIndex");
        int index = 0;
        Object o = new Address();
        CustomDoublyLinkedList instance = new CustomDoublyLinkedList();
        //We can use the instance.getSize() method to always add to the end
        //although we could just use 'tail'
        instance.insertAtIndex(index, instance.getSize());
    }

    /**
     * Test of deleteFromIndex method, of class CustomDoublyLinkedList.
     */
    @Test
    public void testDeleteFromIndex() throws Exception {
        System.out.println("deleteFromIndex");
        int index = 1;
        CustomDoublyLinkedList instance = new CustomDoublyLinkedList();
        instance.insertAtHead(new Address());
        instance.insertAtHead(new Address());
        instance.deleteFromIndex(instance.getSize() - 1);
    }

    /**
     * Test of getPrev method, of class CustomDoublyLinkedList.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        CustomDoublyLinkedList instance = new CustomDoublyLinkedList();
        Object address0 = new Address();
        System.out.println("address0 = " + address0);
        Object address1 = new Address();
        System.out.println("address1 = " + address1);
        Object address2 = new Address();
        System.out.println("address2 = " + address2);
        instance.insertAtHead(address0);
        instance.insertAtHead(address1);
        instance.insertAtHead(address2);
        instance.currentNode = instance.tail;
        System.out.println("Prev is " + instance.currentNode.prev);
        
        while(instance.getPrev() != null){
            System.out.println("Current o = " + instance.currentNode.o);
        }
    }
    
}
