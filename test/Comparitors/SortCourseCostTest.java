/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparitors;

import Classes.Course;
import java.util.ArrayList;
import java.util.Collections;
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
public class SortCourseCostTest {
    
    public SortCourseCostTest() {
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
     * Test of compare method, of class SortCourseCost.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        
        Course t = new Course("5JAW", "Java for Web", 450);
        Course t1 = new Course("5JAM", "Java for Mobile", 400);
        
        //Test add to arrayList
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(t);
        courses.add(t1);
        
        //Unsorted
        System.out.println("Unsorted:");
        for(Course c : courses){
            System.out.println(c.toString());
        }
        
        //Sort
        Collections.sort(courses, new SortCourseCost());
        
        //Sorted
        System.out.println("Sorted");
        System.out.println();
        for(Course c : courses){
            System.out.println(c.toString());
        }
        
        SortCourseCost instance = new SortCourseCost();
        int expResult = 1;
        int result = instance.compare(t, t1);
        assertEquals(expResult, result);
    }
}
