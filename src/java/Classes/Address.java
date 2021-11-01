/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Matt G
 */
public class Address {
    private String Number;
    private String Street;
    private String Suburb;
    private String Postcode;
    private String State;

    //Constructors - BEGIN
    public Address() {
        this("", "", "", "", "");
    }

    public Address(String Number, String Street, String Suburb, String Postcode, String State) {
        this.Number = Number;
        this.Street = Street;
        this.Suburb = Suburb;
        this.Postcode = Postcode;
        this.State = State;
    }
    //Constructors - END

    //G&S - BEGIN
    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getSuburb() {
        return Suburb;
    }

    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    //G&S - END
    
}
