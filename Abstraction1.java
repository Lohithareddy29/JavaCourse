abstract class Pets {
    abstract void makeSound();

    void sleep() {
        System.out.println("Zzz...");
    }
}

class Doggg extends Pets {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Pets {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Doggg dog = new Doggg();
        Cat cat = new Cat();

        System.out.println("Dog:");
        dog.makeSound();
        dog.sleep();

        System.out.println("\nCat:");
        cat.makeSound();
        cat.sleep();
    }
}
