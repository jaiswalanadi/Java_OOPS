class Student{
    String name;
    int roll_no;
}
public class oops1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("Name of student s is: " + s.name);
        System.out.println("Roll no. of student s is: " + s.roll_no);
    }
}