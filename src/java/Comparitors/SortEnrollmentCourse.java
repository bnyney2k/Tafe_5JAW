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
public class SortEnrollmentCourse implements Comparator<Enrollment> {

    @Override
    public int compare(Enrollment t, Enrollment t1) {
        if(t.getCourse().hashCode() < t1.getCourse().hashCode()){
            return -1;
        }else if(t.getCourse().hashCode() == t1.getCourse().hashCode()){
            return 0;
        }else{
            return 1;
        }
    }
    
}
