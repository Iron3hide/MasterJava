class for_loop_basic{
    public static void main(String[] args){

        int a=6;
        System.out.println("Mathematical table of 6");
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d",a,i,a*i).println();
        }
        System.out.println();

        int b=7;
        System.out.println("Mathematical table of 7");
        for(int j=1;j<=10;j++){
            System.out.printf("%d * %d = %d",b,j,b*j).println();
        }

        System.out.println();

        int c=10;
        System.out.println("Mathematical table of 10");
        for(int k=1;k<=10;k++){
            System.out.printf("%d * %d = %d",c,k,c*k).println();
        }

        System.out.println();

        System.out.println("Numbers from 1 to 10:");
        for(int count=1;count<=10;count++){
            System.out.printf("%d",count).println();
        }

        System.out.println();

        System.out.println("Numbers from 10 to 1:");
        for(int r=10;r>=1;r--){
            System.out.printf("%d",r).println();
        }

        System.out.println();

        System.out.println("Squares of nos from 1 to 10");
        for(int q=1;q<=10;q++){
            System.out.println(q*q);
        }

        System.out.println();

        System.out.println("Squares of first 10 even nos");
        for(int s=2;s<=20;s=s+2){
            System.out.println(s*s);
        }

        System.out.println();

        System.out.println("Squares of first 10 odd nos");
        for(int t=1;t<=20;t=t+2){
            System.out.println(t*t);
        }
    }
}