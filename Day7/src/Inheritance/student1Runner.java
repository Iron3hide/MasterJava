package Inheritance;

public class student1Runner {

    public static void main(String[] args){

        //student1 stud1 = new student1();
        //stud1.setName("Shinchan");
        //stud1.setEmail("abc@gmail.com");

        /*Person person = new Person();
        person.setName("Shinchan");
        person.setEmail("xyz@gmail.com");
        person.setPhonenumber("9786543210");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);*/

        employee emp = new employee("Shinchan","Developer");
        //emp.setName("Shinchan");
        emp.setEmail("xyz@gmail.com");
        emp.setPhonenumber("9786543210");
        emp.setEmployeeGrade('A');
        emp.setTitle("Developer");

        System.out.println(emp);
    }
}
