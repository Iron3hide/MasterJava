class method_numbers{
    static void printnoscount(int n){
        for(int i=0;i<=n;i++){
            System.out.printf("the nos. are %d",i).println();
        }
    }

    static void squaresofnos(int n){
        for(int j=1;j<=n;j++){
            System.out.printf("the squares of nos are %d",j*j).println();
        }
    }

    public static void main(String[] args){
        printnoscount(5);
        squaresofnos(6);
    }
}