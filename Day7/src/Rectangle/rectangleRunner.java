package Rectangle;

import java.util.Scanner;

public class rectangleRunner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of triangle: ");
        int length = scanner.nextInt();

        System.out.println("Enter width of triangle: ");
        int width = scanner.nextInt();

        rectangle rect = new rectangle(length,width);

        System.out.println("Area of Rectangle is: " +rect.calcArea());
        System.out.println(("Perimeter of Rectangle is: " +rect.calcPerimeter()));
    }
}
