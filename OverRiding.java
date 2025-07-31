class person {
    String name;
    int age;
    public void displayperson() {
        System.out.println("The name of this person is :"+name);
        System.out.println("The name of this person is :"+age);
    }
}
class Student extends person { 
        int rollno;
        public void displayperson() {
            super.displayperson();
        System.out.println("The name of this Student is :"+rollno);
    }
public class OverRiding{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "lohitha";
        s1.age = 20;
        s1.displayperson();
    }
}
}
    

