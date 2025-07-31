class Student {
    String name;
    int rollno;
    char grade;
    public void displaydetails() {
        System.out.println("The name of this Student is :"+name);
        System.out.println("The name of this Student is :"+rollno);
        System.out.println("The name of this Student is :"+grade);
    }
}
public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "lohitha";
        s1.rollno = 9;
        s1.grade = 'A';
        s1.displaydetails();
    }
}