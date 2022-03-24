package mathoperations;

public class calculateRunner {

    public static void main(String[] args) {
        calculate calc = new calculate(5,10);

        System.out.println(calc.add());

        System.out.println(calc.multiply());

        calc.doubleValue();

        System.out.println(calc.getA());

        System.out.println(calc.getB());
    }

}
