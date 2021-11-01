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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of getEnrollment method, of class Student.
     */
    @Test
    public void testGetEnrollment() {
        System.out.println("getEnrollment");
        Student instance = new Student();
        Enrollment expResult = instance.getEnrollment();
        Enrollment result = instance.getEnrollment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnrollment method, of class Student.
     */
    @Test
    public void testSetEnrollment() {
        System.out.println("setEnrollment");
        Enrollment Enrollment = new Enrollment();
        Student instance = new Student();
        instance.setEnrollment(Enrollment);
    }

    /**
     * Test of getProgram method, of class Student.
     */
    @Test
    public void testGetProgram() {
        System.out.println("getProgram");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getProgram();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgram method, of class Student.
     */
    @Test
    public void testSetProgram() {
        System.out.println("setProgram");
        String Program = "";
        Student instance = new Student();
        instance.setProgram(Program);
    }

    /**
     * Test of getDateRegistered method, of class Student.
     */
    @Test
    public void testGetDateRegistered() {
        System.out.println("getDateRegistered");
        Student instance = new Student();
        instance.setDateRegistered(new Date());
        Date expResult = new Date();
        Date result = instance.getDateRegistered();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateRegistered method, of class Student.
     */
    @Test
    public void testSetDateRegistered() {
        System.out.println("setDateRegistered");
        Date DateRegistered = null;
        Student instance = new Student();
        instance.setDateRegistered(DateRegistered);
    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Student instance = new Student();
        int expResult = instance.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
