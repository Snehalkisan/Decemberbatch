package School;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alisha", 15, "A");

        // Create a Teacher object
        Teacher teacher = new Teacher("Mr. Kadam", 35, "Mathematics");

        // Display details of the Student
        System.out.println("Student Details:");
        student.displayInfo();

        // Display details of the Teacher
        System.out.println("Teacher Details:");
        teacher.displayInfo();
    }
}
