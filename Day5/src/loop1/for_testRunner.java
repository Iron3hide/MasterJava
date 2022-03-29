package loop1;

import java.util.Scanner;

public class for_testRunner {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for_test for_t = new for_test(number);
        System.out.printf("Entered number is: %d",number).println();

        boolean result = for_t.isprime();

        System.out.println();
        System.out.println("is the Number prime? : " + result);


        System.out.println();
        System.out.println("Total sum of digits upto the entered number: " + for_t.sumUptoN());

        System.out.println();
        System.out.println("Total sum of divisors of the entered number: " + for_t.sumOfDivisors());

        System.out.println();
        for_t.numberTriangle();

        System.out.println();
        for_t.lowerTriangle();
    }
}