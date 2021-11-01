/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparitors;

import Classes.Student;
import java.util.ArrayList;
import java.util.Collections;
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
public class SortStudentDateRegisteredTest {
    
    public SortStudentDateRegisteredTest() {
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
     * Test of compare method, of class SortStudentDateRegistered.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Date Date1 = new Date();
        Date1.setTime(0);
        Student t = new Student("Dp Software Development",  new Date(), "Matt", "Matt@Matt.Matt", "0404080804", "10", "Downing Street", "Marion", "5043", "SA", new Date(), "D", 2);
        Student t1 = new Student("Dp Software Development",  Date1, "Matt", "Matt@Matt.Matt", "0404080804", "10", "Downing Street", "Marion", "5043", "SA", Date1, "D", 1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(t);
        students.add(t1);
        
        System.out.println("Unsorted");
        for(Student s : students){
            System.out.println(s.toString());
        }
        
        Collections.sort(students, new SortStudentDateRegistered());
        System.out.println("Sorted");
        System.out.println();
        for(Student s : students){
            System.out.println(s.toString());
        }
        
        SortStudentDateRegistered instance = new SortStudentDateRegistered();
        int expResult = 1;
        int result = instance.compare(t, t1);
        assertEquals(expResult, result);
    }
    
}
