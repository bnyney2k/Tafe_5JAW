/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

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
public class SearchUtilsTest {

    public SearchUtilsTest() {
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
     * Test of findLinear method, of class SearchUtils.
     */
    @Test
    public void testFindLinearCourse() {
        System.out.println("findLinear - Course");
        Object _find = new Course("5JAW", "Java for Web", 0.00);
        List<Object> _in = new ArrayList();
        _in.add(new Course("5SDA", "Software Design Advanced", 400));
        _in.add(new Course("4JAB", "Java for Mobile", 400));
        _in.add(_find);
        Object expResult = _find;
        Object result = SearchUtils.findLinear(_find, _in);
        assertEquals(expResult, result);
    }

    /**
     * Test of findBinary method, of class SearchUtils.
     */
    @Test
    public void testFindBinaryCourse() {
        System.out.println("findBinary - Course");
        Object _find = new Course("5JAW", "Java for Web", 0.00);
        List<Object> _inSorted = new ArrayList();
        _inSorted.add(new Course("5SDA", "Software Design Advanced", 400));
        _inSorted.add(new Course("4JAB", "Java for Mobile", 400));
        _inSorted.add(_find);
        Object expResult = _find;
        Object result = SearchUtils.findBinary(_find, _inSorted);
        assertEquals(expResult, result);
    }

    /**
     * Test of findLinear method, of class SearchUtils.
     */
    @Test
    public void testFindLinearStudent() {
        System.out.println("findLinear - Student");
        Object _find = new Student(
                "Dip Software Development",
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
                1);
        List<Object> _in = new ArrayList();
        _in.add(new Student(
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
        _in.add(new Student(
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
        _in.add(_find);
        Object expResult = _find;
        Object result = SearchUtils.findLinear(_find, _in);
        assertEquals(expResult, result);
    }

    /**
     * Test of findBinary method, of class SearchUtils.
     */
    @Test
    public void testFindBinaryStudent() {
        System.out.println("findBinary - Student");
        Object _find = new Student(
                "Dip Software Development",
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
                1);
        List<Object> _inSorted = new ArrayList();
        _inSorted.add(new Student(
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
        _inSorted.add(new Student(
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
        _inSorted.add(_find);
        Object expResult = _find;
        Object result = SearchUtils.findBinary(_find, _inSorted);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of findLinear method, of class SearchUtils.
     */
    @Test
    public void testFindLinearEnrollment() {
        System.out.println("findLinear - Enrollment");
        Object _find = new Enrollment(new Course("5JAB", "Java for Mobile", 400), new Date(), "D", 2);
        List<Object> _in = new ArrayList();
        _in.add(new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "A", 2));
        _in.add(new Enrollment(new Course("4CSharp", "C#", 400), new Date(), "B", 2));
        _in.add(_find);
        Object expResult = _find;
        Object result = SearchUtils.findLinear(_find, _in);
        assertEquals(expResult, result);
    }

    /**
     * Test of findBinary method, of class SearchUtils.
     */
    @Test
    public void testFindBinaryEnrollment() {
        System.out.println("findBinary - Enrollment");
        Object _find = new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "D", 2);
        List<Object> _inSorted = new ArrayList();
        _inSorted.add(new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "A", 2));
        _inSorted.add(new Enrollment(new Course("5JAW", "Java for Web", 400), new Date(), "B", 2));
        _inSorted.add(_find);
        Object expResult = _find;
        Object result = SearchUtils.findBinary(_find, _inSorted);
        assertEquals(expResult, result);
    }

}
