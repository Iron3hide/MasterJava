package loop3;

import java.util.Scanner;

public class doWhileRunner {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number=0;

        do{
            if(number!=-1)
            {
                System.out.println("Cube is:" +(number * number * number));
            }

            System.out.println("Enter a number: ");
            number = scanner.nextInt();

        }while (number>=0);

        System.out.println("Thanks for entering Negative number...Exit");
    }
}