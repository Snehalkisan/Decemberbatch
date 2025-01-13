package School;

public class Student extends Person
{

        private String grade;

        // Constructor
        public Student(String name, int age, String grade)
        {
            super(name, age); // Call the superclass constructor
            this.grade = grade;
        }

        // to get grade
        public String getGrade()
        {
            return grade;
        }

        // Override displayInfo method
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call the superclass method
                System.out.println("Grade: " + grade);

        }
}

