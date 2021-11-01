/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparitors;

import Classes.Student;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class SortStudentName implements Comparator<Student> {

    @Override
    public int compare(Student t, Student t1) {
            return t.getName().compareTo(t1.getName());
    }
    
}
