package Conditionals;

import java.util.Scanner;

public class menuRunner {

    public static void main(String[] args){

        System.out.println("Menu: 1.Addition 2.Substraction 3.Multiplication 4. Division 5. Modulo 6. Default");

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.printf("Number you entered is:%d",number1).println();

        System.out.println("Enter second number:");
//        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner.nextInt();
        System.out.printf("Number you entered is:%d",number2).println();

        System.out.println("Enter your choice of operation");
//        Scanner scanner3 = new Scanner(System.in);
        int ch = scanner.nextInt();

        private static void calculate(int ch){
            switch (ch) {
                case 1:
                    System.out.println("Result: " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("Result: " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("Result: " + (number1 * number2));
                    break;
                case 4:
                    System.out.println("Result: " + (number1 / number2));
                    break;
                case 5:
                    System.out.println("Result: " + (number1 % number2));
                    break;
                default:
                    System.out.println("Invalid Choice entered");
                    break;
            }
        }
    }
}