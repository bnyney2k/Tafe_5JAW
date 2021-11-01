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
 * @author Matt G
 */
public class SortEnrollmentDateEnrolled implements Comparator<Enrollment> {

    @Override
    public int compare(Enrollment t, Enrollment t1) {
        return t.getDateEnrolled().compareTo(t1.getDateEnrolled());
    }
    
}
