package interface2;

interface flyable{
    void fly();
}

class Bird implements flyable {

    @Override
    public void fly()
    {
        System.out.println("Bird flys with wings");
    }
}

class aeroplane implements flyable{

    @Override
    public void fly()
    {
        System.out.println("Aeroplane flys with fuel");
    }
}

public class flyableRunner {
    public static void main(String[] args){
        flyable[] flyingObjects = {new Bird(),new aeroplane()};
        for(flyable object : flyingObjects)
        {
            object.fly();
        }
    }
}