/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;

/**
 *
 * @author Matt G
 */
public class Course {
    private String CourseCode;
    private String CourseName;
    private double Cost;

    //Constructors - BEGIN
    public Course() {
        this("", "", 0.00);
    }

    public Course(String CourseCode, String CourseName, double Cost) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.Cost = Cost;
    }
    //Constructors - END
    
    //G&S - BEGIN
    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }
    //G&S - END
    
    //Hash and equals - BEGIN
    //Matt G - Being that this is just a course, Course name is unique enough
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.CourseCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        
        return Objects.equals(this.CourseCode, other.CourseCode);
    }
    //Hash and equals - END

    @Override
    public String toString() {
        return "Course{" + "CourseCode=" + CourseCode + ", CourseName=" + CourseName + ", Cost=" + Cost + '}';
    }
    
    
    
}
