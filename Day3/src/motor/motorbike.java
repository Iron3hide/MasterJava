package motor;

public class motorbike {

    private int speed;
    void start() {
        System.out.println("Bike started");
    }

    void bike_speed_is(int speed){
        this.speed=speed;
        System.out.printf("bike speed is: %d",this.speed).println();
    }

    void increaseSpeed(int speed){
        this.speed = this.speed + speed;
        System.out.printf("bike speed increased to %d",this.speed).println();
    }

    void decreaseSpeed(int speed){
        this.speed = this.speed - speed;
        System.out.printf("bike speed decreased to %d",this.speed).println();
    }
}