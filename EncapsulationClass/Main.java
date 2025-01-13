package EncapsulationClass;

public class Main {

    public static void main(String[] args) {
        // Create an instance of Person Class
        Person person = new Person();

        // Set values using setter methods
        person.setName("Snehal Kadam");
        person.setAge(28);

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();

        // Print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

}
