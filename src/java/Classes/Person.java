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
public class Person {
    private String Name;
    private String Email;
    private String TelNum;
    private Address Address;

    //Constructors - BEGIN
    public Person() {
        //Address is composition so it's best to pass in the address parameters rather than an address object
        this("", "", "", "", "", "", "", "");
    }

    public Person(String Name, String Email, String TelNum, String Number, String Street, String Suburb, String Postcode, String State) {
        this.Name = Name;
        this.Email = Email;
        this.TelNum = TelNum;
        this.Address = new Address(Number, Street, Suburb, Postcode, State);
    }
    //Constructors - END
    
    public Address getAddress() {
        return Address;
    }

    //G&S - BEGIN
    public void setAddress(Address Address) {    
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelNum() {
        return TelNum;
    }

    public void setTelNum(String TelNum) {
        this.TelNum = TelNum;
    }
    //G&S - END

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Name);
        hash = 97 * hash + Objects.hashCode(this.Address);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Address, other.Address)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
