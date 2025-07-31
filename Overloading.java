class Student{
    String name;
    int age;
    public void  displayInfo(String name){
        System.out.println("Name: " + name);
    }
    public void displayInfo(int age){
        System.out.println("Age: " + age);
    }
    public void displayInfo(String name, int age){
        System.out.println("Name: " + name + " Age: " + age);
}
}
public class Overloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="lohitha";
        s1.age=20;
        s1.displayInfo(s1.name);
        s1.displayInfo(s1.age);
        s1.displayInfo(s1.name,s1.age);
    }
}