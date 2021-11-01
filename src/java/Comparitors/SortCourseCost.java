/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparitors;

import Classes.Course;
import java.util.Comparator;

/**
 *
 * @author Matt G
 */
public class SortCourseCost implements Comparator<Course> {

    @Override
    public int compare(Course t, Course t1) {
        Double cost = t.getCost();
        Double cost1 = t1.getCost();
        return cost.compareTo(cost1);
    }
    
}
