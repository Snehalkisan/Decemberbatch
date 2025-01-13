package School;

public class Person {
    //initialise property
    private String name;
    private int age;

    //constructor of Person class
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //method to display info
    public void displayInfo(){
        System.out.println("Name: " + name + " Age " + age);
    }

}
