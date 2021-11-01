/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Matt G
 */
public class Enrollment {
    private Date DateEnrolled;
    private String Grade;
    private int Semester;
    private Course Course;

    //Constructors - BEGIN
    public Enrollment() {
        //Course is aggregation, so we pass in an aggregation object
        this(new Course(), new Date(), "", 0);
    }

    public Enrollment(Course Course, Date DateEnrolled, String Grade, int Semester) {
        this.DateEnrolled = DateEnrolled;
        this.Grade = Grade;
        this.Semester = Semester;
        this.Course = Course;
    }
    //Constructors - END
    
    

    //G&S - BEGIN
    public Course getCourse() {
        return Course;
    }
    
    public void setCourse(Course Course) {    
        this.Course = Course;
    }

    public Date getDateEnrolled() {
        return DateEnrolled;
    }

    public void setDateEnrolled(Date DateEnrolled) {
        this.DateEnrolled = DateEnrolled;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }
    
    //G&S - END

    //Hash & equals - BEGIN
    
    
    //Matt G. - Course and semester are enough to make this unique.
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.Semester;
        hash = 97 * hash + Objects.hashCode(this.Course);
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
        final Enrollment other = (Enrollment) obj;
        if (this.Semester != other.Semester) {
            return false;
        }
        if (!Objects.equals(this.Course, other.Course)) {
            return false;
        }
        return true;
    }
    //Hash & equals - END

    @Override
    public String toString() {
        return "Enrollment{" + "DateEnrolled=" + DateEnrolled + ", Grade=" + Grade + ", Semester=" + Semester + ", Course=" + Course + '}';
    }
    
    
    
}
