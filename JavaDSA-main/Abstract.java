// Interface
interface Animal {
    void makeSound(); // abstract method
}

// Abstract class
abstract class Bird {
    abstract void fly(); // abstract method

    void eat() {
        System.out.println("Bird is eating.");
    }
}

class Sparrow extends Bird implements Animal {
    public void makeSound() {
        System.out.println("Sparrow chirps.");
    }

    void fly() {
        System.out.println("Sparrow flies high.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.makeSound(); 
        s.fly();       
        s.eat();       
    }
}
