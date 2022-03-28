package arrayList2;

import java.math.BigDecimal;
import java.util.Arrays;

public class student1Runner
{
    public static void main(String[] args){

        int[] marks = {60,70,80};

        student1 newstudent = new student1("Student",marks);

        System.out.println("Array given: " + Arrays.toString(marks));
        System.out.println();

        System.out.println("Total no. of marks in array: " +newstudent.lengthOfMarks());
        System.out.println();

        System.out.println("Total sum of marks: " + newstudent.sumOfMarks());
        System.out.println();

        System.out.println("Minimum of marks: " + newstudent.minimumOfMarks());
        System.out.println();

        System.out.println("Maximum of marks: " + newstudent.maximumOfMarks());
        System.out.println();

        BigDecimal average = newstudent.averageOfMarks();
        System.out.println("Average of marks: " + average);
        System.out.println();

        newstudent.addMark(90);
        System.out.println(newstudent);

        newstudent.removeMark(0);
        System.out.println(newstudent);
    }
}