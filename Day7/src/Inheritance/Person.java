package Inheritance;

public class Person extends Object{
    private String name;
    private String email;
    private String phonenumber;

    public Person(String name) {
        System.out.println("Person Constructor");
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String toString(){
        //return getClass().getName() + '#' + Integer.toHexString(hashCode());
        return name + '#' + email + '#' + phonenumber;
    }

}