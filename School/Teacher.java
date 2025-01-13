package School;

public class Teacher extends Person {
    private String subject;

    // Constructor for Teacher class
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the superclass constructor
        this.subject = subject;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Subject: " + subject);
    }
}
