package SimpleInterest;

import java.math.BigDecimal;

public class simpleRunner {

    public static void main(String[] args){
        simple calculator = new simple("4000","8");

        BigDecimal totalValue = calculator.simpleInterestCalculate(5);

        System.out.println("Total Amount due to Interest is: " +totalValue);

    }
}
