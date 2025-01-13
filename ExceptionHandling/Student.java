package ExceptionHandling;
public class Student {
    // initialising attributes of student class
    private int studentId;
    private String name;
    private int age;

    //create a constructor of student class
    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    // method to display Student detalis
    public void displayDetails() {
        System.out.println("Student Id: " + studentId + " Name: " + name + " age: " + age);

    }

    // create a method to set age limit
    public void setAge(int age) {
        try {
            if (age < 5 || age > 100) {
                throw new IllegalArgumentException("age condition not satisfied");
            }

            this.age = age;
            System.out.println("You are eligilbe to take admission");
        } catch (IllegalArgumentException e) {
            System.out.println(" You are not eligible to take admission");
        }
    }


    public static void main(String[] args) {
        //create instance of student class
        Student student1 = new Student(101, "Snehal", 28);
        Student student2 = new Student(102, "Shital", 26);
        System.out.println("Display the details of student");
        student1.displayDetails();
        student2.displayDetails();
        //attemting to set invalid age
        System.out.println("Attempting to set invalid age");
        student1.setAge(4);

    }
}