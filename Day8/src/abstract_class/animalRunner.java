package abstract_class;

    abstract class Animal{
        abstract void bark();
    }

    class Dog extends Animal{
        public void bark(){
            System.out.println("Bow Bow");
        }
    }

     class Cat extends Animal{
        public void bark(){
            System.out.println("Meow Meow");
        }
    }

public class animalRunner {

    public static void main(String[] args){
        Animal[] animals = {new Cat(), new Dog()};
        for(Animal i:animals)
        {
            i.bark();
        }
    }
}