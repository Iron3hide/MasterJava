class practice{
    public static void main(String[] args){

        System.out.println("hello world");
        System.out.println();

        int a=5,b=1;
        while(b<=10){
            System.out.printf("%d * %d = %d",a,b,a*b).println();
            b++;
        }
        System.out.println();

        int i,j;
        for(i=5;i>=1;i--)
        {
            for (j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        for(i=2;i<=5;i++)
        {
            for (j = 1; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        char ch='A';
        //System.out.printf("%c",ch).println();
        int in=1;
        while(in<=10)
        {
            in++;
            System.out.printf("%c",ch++).println();
        }

        /*char cha='A';
        for(int i=1;i<=5;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(cha++);
            }
            System.out.println();
        }*/

        /*char ch='A';
        for(int i=1;i<=5;i++){
            System.out.printf("%d",i);
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }*/
    }
}