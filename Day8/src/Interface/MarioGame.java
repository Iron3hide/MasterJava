package Interface;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Duck down");
    }

    @Override
    public void left() {
        System.out.println("Move in left direction");
    }

    @Override
    public void right() {
        System.out.println("Move in right direction");
    }
}
