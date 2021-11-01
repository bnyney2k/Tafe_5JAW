/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparitors;

import Classes.Enrollment;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class SortEnrollmentSemester implements Comparator<Enrollment> {

    @Override
    public int compare(Enrollment t, Enrollment t1) {
        Integer i = t.getSemester();
        Integer i1 = t1.getSemester();
        return i.compareTo(i1);
    }
    
}
