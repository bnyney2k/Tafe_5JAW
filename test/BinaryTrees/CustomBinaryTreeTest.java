/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

import Classes.Address;
import java.util.ArrayList;
import java.util.List;
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
public class CustomBinaryTreeTest {
    
    public CustomBinaryTreeTest() {
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
     * Test of add method, of class CustomBinaryTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object o = new Address();
        CustomBinaryTree instance = new CustomBinaryTree();
        instance.add(o);
        
        Object oFound = instance.find(o);
        
        System.out.println("Expected = " + o + ", result = " + oFound);
    }

    /**
     * Test of find method, of class CustomBinaryTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object o = new Address();
        CustomBinaryTree instance = new CustomBinaryTree();
        Object expResult = o;
        instance.add(o);
        Object result = instance.find(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class CustomBinaryTree.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object o = new Address();
        CustomBinaryTree instance = new CustomBinaryTree();
        instance.add(o);
        instance.delete(o);
        
        System.out.println("Was it deleted?: " + (instance.find(o) == null));
    }

    /**
     * Test of getObjectList_InOrder method, of class CustomBinaryTree.
     */
    @Test
    public void testGetObjectList_InOrder() {
        System.out.println("getObjectList_InOrder");
        CustomBinaryTree.Node node = null;
        List<Object> list = null;
        CustomBinaryTree instance = new CustomBinaryTree();
        instance.getObjectList_InOrder(node, list);
    }

    /**
     * Test of getObjectList_PreOrder method, of class CustomBinaryTree.
     */
    @Test
    public void testGetObjectList_PreOrder() {
        System.out.println("getObjectList_PreOrder");
        CustomBinaryTree.Node node = null;
        List<Object> list = new ArrayList();
        CustomBinaryTree instance = new CustomBinaryTree();
        List<Object> expResult = list;
        List<Object> result = instance.getObjectList_PreOrder(node, list);
        assertEquals(expResult, result);
    }

    /**
     * Test of getObjectList_PostOrder method, of class CustomBinaryTree.
     */
    @Test
    public void testGetObjectList_PostOrder() {
        System.out.println("getObjectList_PostOrder");
        CustomBinaryTree.Node node = null;
        List<Object> list = new ArrayList();
        CustomBinaryTree instance = new CustomBinaryTree();
        List<Object> expResult = list;
        List<Object> result = instance.getObjectList_PostOrder(node, list);
        assertEquals(expResult, result);
    }
    
}
