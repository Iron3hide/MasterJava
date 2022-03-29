package loop1;

public class for_test {

    private int number;

    public for_test(int number) {
        this.number = number;
    }

    public boolean isprime() {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public void numberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public void lowerTriangle() {
        for (int i = number; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}