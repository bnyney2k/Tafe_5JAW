/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Matt G
 */
public class Student extends Person {
    private String Program;
    private Date DateRegistered;
    private Enrollment Enrollment;

    //Constructors - BEGIN

    public Student() {
        //Enrollment is composition so it's best to pass in Enrollment parameters rather than an Enrollment parameter 
        this("", new Date(), "", "", "", "", "", "", "", "", new Date(), "", 0);
    }

    public Student(String Program, Date DateRegistered, String Name, String Email, String TelNum, String Number, String Street, String Suburb, String Postcode, String State, Date DateEnrolled, String Grade, int Semester) {
        super(Name, Email, TelNum, Number, Street, Suburb, Postcode, State);
        this.Program = Program;
        this.DateRegistered = DateRegistered;
        this.Enrollment = new Enrollment(new Course(), DateEnrolled, Grade, Semester);
    }
    //Constructors - END
    
    public Enrollment getEnrollment() {
        return Enrollment;
    }

    //G&S - BEGIN
    public void setEnrollment(Enrollment Enrollment) {    
        this.Enrollment = Enrollment;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public Date getDateRegistered() {
        return DateRegistered;
    }

    public void setDateRegistered(Date DateRegistered) {
        this.DateRegistered = DateRegistered;
    }
    //G&S - END

    //Hash & equals - BEGIN
    
    
    
    //Hash & equals - END

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.Program);
        hash = 23 * hash + Objects.hashCode(this.DateRegistered);
        hash = 23 * hash + Objects.hashCode(this.Enrollment);
        return hash;
    }

    //Matt G - The program and date registered still don't quite make it unique enough,
    //So an additional call to super.equals() is made to ensure we are dealing with the same Person
    //as well.
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.Program, other.Program)) {
            return false;
        }
        if (!Objects.equals(this.DateRegistered, other.DateRegistered)) {
            return false;
        }
        
        
        //Let's check the super class as well as this class is not unique enough - Matt G
        if(!super.equals(obj)){
            return false;
        }
        
        return Objects.equals(this.Enrollment, other.Enrollment);
    }

    @Override
    public String toString() {
        return "Student{" + "Program=" + Program + ", DateRegistered=" + DateRegistered + ", Enrollment=" + Enrollment + '}';
    }
    
    
    
    
}
