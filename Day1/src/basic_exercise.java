class basic_exercise{

public static void main(String[] args){

    System.out.println("Hello World");
    System.out.println();

    System.out.println("5 * 3 as is");
    System.out.println();

    System.out.println(5*3);
    System.out.println();

    System.out.println("Mathematical table of 5 : ");
    for(int i=1; i<=10; i++)
    {
        System.out.printf("5 * %d = %d",i,5*i).println();
    }

    System.out.println();
    int h=24,m=60,s=60;
    System.out.printf("Number of seconds in a day = %d hours * %d mins * %d secs = %d seconds",h,m,s,h*m*s).println();
}
}