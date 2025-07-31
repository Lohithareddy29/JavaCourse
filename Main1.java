class Dog {
    String name;
    String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void bark() {
        System.out.println(name + " says bow bow!");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Goldem Retriever");
        System.out.println("My dog's name is " + myDog.name + " and its a" + myDog.breed + ".");
        myDog.bark();

    }
}
