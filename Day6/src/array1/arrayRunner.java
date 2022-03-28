package array1;

import java.math.BigDecimal;
import java.util.Arrays;

public class arrayRunner {

    public static void main(String[] args){

        int[] marks = {50,60,70,80,90,95,85,75};

        array newarray = new array("GEETA",marks);

        //System.out.println("Array given: " +marks);
        System.out.println("Array given: " + Arrays.toString(marks));
        System.out.println();

        System.out.println("Total no. of marks in array: " +newarray.lengthOfMarks());
        System.out.println();

        System.out.println("Total sum of marks: " + newarray.sumOfMarks());
        System.out.println();

        System.out.println("Minimum of marks: " + newarray.minimumOfMarks());
        System.out.println();

        System.out.println("Maximum of marks: " + newarray.maximumOfMarks());
        System.out.println();

        BigDecimal average = newarray.averageOfMarks();
        System.out.println("Average of marks: " + average);
        System.out.println();
    }
}