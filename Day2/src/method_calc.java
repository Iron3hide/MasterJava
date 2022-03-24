class method_calc{

    static void minutecalc(){
        int h=24,m=60;
        System.out.printf("Total minutes in a day = %d hours * %d mins = %d mins ",h,m,h*m).println();
    }

    static void secondcalc(){
        int h=24,m=60,s=60;
        System.out.printf("Total seconds in a day = %d hours * %d mins * %d secs = %d seconds",h,m,s,h*m*s).println();
    }
    public static void main(String[] args){
        minutecalc();
        secondcalc();
    }
}