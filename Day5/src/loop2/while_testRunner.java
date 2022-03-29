package loop2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class while_testRunner {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a limit to calculate Squares upto:");

        int number = scanner.nextInt();

        while_test sample = new while_test();

        System.out.println("Squares upto entered no.:");
        sample.squaresUptoLimit(number);
        System.out.println();

        System.out.println("Cubes upto entered no.:");
        sample.cubesUptoLimit(number);
        System.out.println();
    }
}
