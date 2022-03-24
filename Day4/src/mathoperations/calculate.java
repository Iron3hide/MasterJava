package mathoperations;

public class calculate {

    private int a;
    private int b;

    public calculate(int a,int b) {
        this.a=a;
        this.b=b;
    }

    public int add(){
        //int sum=a+b;
        //System.out.printf("%d + %d = %d",a,b,sum).println();
        return a+b;
    }

    public int multiply(){
        //int mul=a*b;
        //System.out.printf("%d * %d = %d",a,b,mul).println();
        return a*b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void doubleValue(){
        this.a=this.a*2;
        this.b=this.b*2;
    }
}