package SimpleInterest;

import java.math.BigDecimal;

public class simple {

    BigDecimal Principal;
    BigDecimal Interest;

    public simple(String Principal,String Interest){
        this.Principal=new BigDecimal(Principal);
        this.Interest=new BigDecimal(Interest).divide(new BigDecimal(100));
    }

    public BigDecimal simpleInterestCalculate(int duration){
        BigDecimal totalValue = Principal.add(Principal.multiply(Interest).multiply(new BigDecimal(duration)));
        return totalValue;
    }
}
