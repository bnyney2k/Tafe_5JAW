/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedLists;

import Classes.Address;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class CustomLinkedListTest {
    
    public CustomLinkedListTest() {
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
     * Test of insertAtTail method, of class CustomLinkedList.
     */
    @Test
    public void testInsertAtTail() {
        System.out.println("insertAtTail");
        Object o = new Address();
        Object oTest = null;
        CustomLinkedList instance = new CustomLinkedList();
        instance.insertAtTail(o);
        
        try {
            oTest = instance.getFromIndex(instance.getSize() - 1);
            System.out.println("is o equal to oTest? " + oTest.equals(o));
        } catch (Exception ex) {
            Logger.getLogger(CustomLinkedListTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getNext method, of class CustomLinkedList.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        CustomLinkedList instance = new CustomLinkedList();
        Object firstObject = new Address();
        Object expResult = new Address();
        instance.insertAtTail(firstObject);
        instance.insertAtTail(expResult);
        instance.resetIndex();
        instance.getNext();
        Object result = instance.getNext();
        assertEquals(expResult, result);
        
        System.out.println("Expected: " + expResult.toString() + ", got: " + result.toString());
        System.out.println("\n");
    }

    /**
     * Test of insertAtHead method, of class CustomLinkedList.
     */
    @Test
    public void testInsertAtHead() {
        System.out.println("insertAtHead");
        Object o = null;
        CustomLinkedList instance = new CustomLinkedList();
        instance.insertAtHead(o);
    }

    /**
     * Test of insertAtIndex method, of class CustomLinkedList.
     */
    @Test
    public void testInsertAtIndex() throws Exception {
        System.out.println("insertAtIndex");
        int index = 0;
        Object o = null;
        CustomLinkedList instance = new CustomLinkedList();
        instance.insertAtIndex(index, o);
    }

    /**
     * Test of deleteFromIndex method, of class CustomLinkedList.
     */
    @Test
    public void testDeleteFromIndex() throws Exception {
        System.out.println("deleteFromIndex");
        int index = 0;
        CustomLinkedList instance = new CustomLinkedList();
        instance.insertAtHead(new Address());
        instance.deleteFromIndex(instance.getSize() - 1);
    }

    /**
     * Test of getFromIndex method, of class CustomLinkedList.
     */
    @Test
    public void testGetFromIndex() throws Exception {
        System.out.println("getFromIndex");
        int index = 3;
        CustomLinkedList instance = new CustomLinkedList();
        Object address0 = new Address();
        System.out.println("address0 = " + address0);
        Object address1 = new Address();
        System.out.println("address1 = " + address1);
        Object address2 = new Address();
        System.out.println("address2 = " + address2);
        Object expResult = new Address();
        System.out.println("expResult = " + expResult);
        instance.insertAtTail(address0);
        instance.insertAtTail(address1);
        instance.insertAtTail(address2);
        instance.insertAtTail(expResult);
        Address result = (Address) instance.getFromIndex(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class CustomLinkedList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        CustomLinkedList instance = new CustomLinkedList();
        int expResult = 2;
        instance.insertAtTail(new Object());
        instance.insertAtTail(new Object());
        int result = instance.getSize();
        assertEquals(expResult, result);
        
        System.out.println("Expected 2, found " + result);
        System.out.println("\n");
    }
    
}
