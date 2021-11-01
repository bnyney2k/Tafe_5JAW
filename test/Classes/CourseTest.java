/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getCourseCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        String CourseCode = "";
        Course instance = new Course();
        instance.setCourseCode(CourseCode);
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = new Course();
        String expResult = "";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String CourseName = "";
        Course instance = new Course();
        instance.setCourseName(CourseName);
    }

    /**
     * Test of getCost method, of class Course.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Course instance = new Course();
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCost method, of class Course.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double Cost = 0.0;
        Course instance = new Course();
        instance.setCost(Cost);
    }

    /**
     * Test of hashCode method, of class Course.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Course instance = new Course();
        int expResult = instance.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
