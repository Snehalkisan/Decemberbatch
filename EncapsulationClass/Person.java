package EncapsulationClass;
// create Person class
class Person {
    // Private field to store the name of the person
    private String name;
    // Private field to store the age of the person
    private int age;

    // Public method to get the name of the person
    public String getName() {
        return name;
    }

    // Public method to set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Public method to get the age of the person
    public int getAge() {
        return age;
    }

    // Public method to set the age of the person
    public void setAge(int age) {
        this.age = age;
    }


}
