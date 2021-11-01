/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;
import java.util.Date;
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
public class EnrollmentTest {
    
    public EnrollmentTest() {
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
     * Test of getCourse method, of class Enrollment.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Enrollment instance = new Enrollment();
        Course expResult = instance.getCourse();
        Course result = instance.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Enrollment.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        Course Course = null;
        Enrollment instance = new Enrollment();
        instance.setCourse(Course);
    }

    /**
     * Test of getDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testGetDateEnrolled() {
        System.out.println("getDateEnrolled");
        Enrollment instance = new Enrollment();
        Date expResult = instance.getDateEnrolled();
        Date result = instance.getDateEnrolled();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testSetDateEnrolled() {
        System.out.println("setDateEnrolled");
        Date DateEnrolled = null;
        Enrollment instance = new Enrollment();
        instance.setDateEnrolled(DateEnrolled);
    }

    /**
     * Test of getGrade method, of class Enrollment.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Enrollment instance = new Enrollment();
        String expResult = "";
        String result = instance.getGrade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrade method, of class Enrollment.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        String Grade = "";
        Enrollment instance = new Enrollment();
        instance.setGrade(Grade);
    }

    /**
     * Test of getSemester method, of class Enrollment.
     */
    @Test
    public void testGetSemester() {
        System.out.println("getSemester");
        Enrollment instance = new Enrollment();
        int expResult = 0;
        int result = instance.getSemester();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSemester method, of class Enrollment.
     */
    @Test
    public void testSetSemester() {
        System.out.println("setSemester");
        int Semester = 0;
        Enrollment instance = new Enrollment();
        instance.setSemester(Semester);
    }

    /**
     * Test of hashCode method, of class Enrollment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Enrollment instance = new Enrollment();
        int expResult = instance.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Enrollment instance = new Enrollment();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
