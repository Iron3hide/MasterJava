package loop2;

public class while_test {

    private int limit;

    public while_test() {
        this.limit = limit;
    }

    public void squaresUptoLimit(int limit){
        int i=1;
        while(i*i<=limit){
            System.out.print(i*i + " ");
            i++;
        }
    }

    public void cubesUptoLimit(int limit) {
        int i=1;
        while (i*i*i<=limit){
            System.out.print(i*i*i + " ");
            i++;
        }
    }
}