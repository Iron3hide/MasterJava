class conditional_basic{

    public static void main(String[] args){

        int a=20,b=4,c=6,d=8;
        if((a+b)>(c+d))
        {
            System.out.println("a+b is greater than c+d");
        }
        else
        {
            System.out.println("a+b is less than c+d");
        }

        System.out.println();
        int angle1=40,angle2=60,angle3=90;
        int total=angle1+angle2+angle3;
        System.out.printf("%d + %d + %d = %d",angle1,angle2,angle3,total).println();
        System.out.println();
        if(total>180)
        {
            System.out.println("The above three angles form a Triangle");
        }
        else
        {
            System.out.println("Cannot form a Triangle");
        }

        System.out.println();
        int num=7;
        if((num%2)==0){
            System.out.printf("%d is even number",num).println();
        }
        else{
            System.out.printf("%d is an odd number",num).println();
        }
    }
}