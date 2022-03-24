package motor;

public class motorbikeRunner {
    public static void main(String[] args){
        motorbike ducati = new motorbike();
        motorbike honda = new motorbike();

        ducati.start();
        ducati.bike_speed_is(100);
        ducati.increaseSpeed(30);
        ducati.decreaseSpeed(45);

        System.out.println();

        honda.start();
        honda.bike_speed_is(80);
        honda.increaseSpeed(50);
        honda.decreaseSpeed(300);
    }
}