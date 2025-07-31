abstract class Animal {
    abstract void makeSound();
    void sleep() {
        System.out.println("eating..!!");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks:Boww Boww..!!");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
    
}
