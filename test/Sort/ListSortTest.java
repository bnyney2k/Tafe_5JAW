/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import Classes.Course;
import Classes.Enrollment;
import Classes.Student;
import java.util.ArrayList;
import java.util.Date;
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
public class ListSortTest {
    
    public ListSortTest() {
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
     * Test of sortByInsertion method, of class ListSortInsertion.
     */
    @Test
    public void testSortByInsertionCourse() {
        System.out.println("sortByInsertion - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Course("5SDA", "Software Design Advanced", 400));
        _list.add(new Course("4JAB", "Java for Mobile", 400));
        _list.add(new Course("5JAW", "Java for Web", 0.00));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Course p = (Course)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortByInsertion(_list, _list.size());
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Course p = (Course)o;
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void testSortByInsertionStudent() {
        System.out.println("sortByInsertion - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Student(
                "Dip Software Development 2",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        _list.add(new Student(
                "Dip Software Development 3",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        _list.add(new Student(
                "Dip Software Development 1",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Student p = (Student)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortByInsertion(_list, _list.size());
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Student p = (Student)o;
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void testSortByInsertionEnrollment() {
        System.out.println("sortByInsertion - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Enrollment(new Course("5JAB", "Java for Mobile", 400), new Date(), "D", 2));
        _list.add(new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "A", 1));
        _list.add(new Enrollment(new Course("4CSharp", "C#", 400), new Date(), "B", 2));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Enrollment p = (Enrollment)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortByInsertion(_list, _list.size());
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Enrollment p = (Enrollment)o;
            System.out.println(p.toString());
        }
    }
    
    
    
    
    
    
    /**
     * Test of sortByInsertion method, of class ListSortInsertion.
     */
    @Test
    public void testSortBySelectionCourse() {
        System.out.println("sortBySelection - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Course("5SDA", "Software Design Advanced", 400));
        _list.add(new Course("4JAB", "Java for Mobile", 400));
        _list.add(new Course("5JAW", "Java for Web", 0.00));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Course p = (Course)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortBySelection(_list);
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Course p = (Course)o;
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void testSortBySelectionStudent() {
        System.out.println("sortBySelection - Student");
        List<Object> _list = new ArrayList();
        
        _list.add(new Student(
                "Dip Software Development 2",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        _list.add(new Student(
                "Dip Software Development 3",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        _list.add(new Student(
                "Dip Software Development 1",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Student p = (Student)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortBySelection(_list);
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Student p = (Student)o;
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void testSortBySelectionEnrollment() {
        System.out.println("sortBySelection - Enrollment");
        List<Object> _list = new ArrayList();
        
        _list.add(new Enrollment(new Course("5JAB", "Java for Mobile", 400), new Date(), "D", 2));
        _list.add(new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "A", 1));
        _list.add(new Enrollment(new Course("4CSharp", "C#", 400), new Date(), "B", 2));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Enrollment p = (Enrollment)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortBySelection(_list);
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Enrollment p = (Enrollment)o;
            System.out.println(p.toString());
        }
    }
    
    
    
    
    @Test
    public void testSortByBubbleCourse() {
        System.out.println("sortByBubble - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Course("5SDA", "Software Design Advanced", 400));
        _list.add(new Course("4JAB", "Java for Mobile", 400));
        _list.add(new Course("5JAW", "Java for Web", 0.00));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Course p = (Course)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortByBubble(_list, _list.size());
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Course p = (Course)o;
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void testSortByBubbleStudent() {
        System.out.println("sortByBubble - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Student(
                "Dip Software Development 2",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        _list.add(new Student(
                "Dip Software Development 3",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        _list.add(new Student(
                "Dip Software Development 1",
                new Date(),
                "Matt G",
                "matthew.gerlach3@student.tafesa.edu.au",
                "0404040404",
                "13",
                "Marion Street",
                "Marion",
                "5043",
                "SA",
                new Date(),
                "D",
                1));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Student p = (Student)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortByBubble(_list, _list.size());
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Student p = (Student)o;
            System.out.println(p.toString());
        }
    }
    
    @Test
    public void testSortByBubbleEnrollment() {
        System.out.println("sortByBubble - Course");
        List<Object> _list = new ArrayList();
        
        _list.add(new Enrollment(new Course("5JAB", "Java for Mobile", 400), new Date(), "D", 2));
        _list.add(new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "A", 1));
        _list.add(new Enrollment(new Course("4CSharp", "C#", 400), new Date(), "B", 2));
        
        System.out.println("\nBefore sort");
        for(Object o: _list){
            Enrollment p = (Enrollment)o;
            System.out.println(p.toString());
        }
        
        ListSort.sortByBubble(_list, _list.size());
        
        System.out.println("\n\nAfter sort");
        for(Object o: _list){
            Enrollment p = (Enrollment)o;
            System.out.println(p.toString());
        }
    }
}
