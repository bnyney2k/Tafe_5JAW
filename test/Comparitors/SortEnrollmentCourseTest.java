/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparitors;

import Classes.Course;
import Classes.Enrollment;
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
public class SortEnrollmentCourseTest {
    
    public SortEnrollmentCourseTest() {
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
     * Test of compare method, of class SortEnrollmentCourse.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Enrollment t = new Enrollment(new Course("5JAW", "Java for Web", 450), new Date(), "D", 2);
        Enrollment t1 = new Enrollment(new Course("5JAM", "Java for Mobile", 400), new Date(), "A", 1);
        ArrayList<Enrollment> Enrollments = new ArrayList<>();
        Enrollments.add(t);
        Enrollments.add(t1);
        System.out.println("Unsorted:");
        for(Enrollment e : Enrollments){
            System.out.println(e.toString());
        }
        
        
        Collections.sort(Enrollments, new SortEnrollmentCourse());
        System.out.println();
        System.out.println("Sorted");
        for(Enrollment e : Enrollments){
            System.out.println(e.toString());
        }
        
        SortEnrollmentCourse instance = new SortEnrollmentCourse();
        int expResult = 1;
        int result = instance.compare(t, t1);
        assertEquals(expResult, result);
    }
    
}
