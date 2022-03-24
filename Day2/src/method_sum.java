class method_sum{

    static void sumof2nos(int a,int b){
        int sum=0;
        sum = a+b;
        System.out.printf("%d + %d = %d",a,b,sum).println();
    }

    static int anglecalc(int angle1,int angle2){
        int angle3 = 180 - (angle1 + angle2);
        return angle3;
    }

    public static void main(String[] args){
        sumof2nos(5,10);
        System.out.printf("Angle3 is %d",anglecalc(40,50)).println();
    }
}