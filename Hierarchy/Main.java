package Hierarchy;

public class Main {
    public static void main(String[] args) {
        // create instance of dog
        Dog dog=new Dog();

        // access the methods from dog
        dog.sound();
        dog.hasFur();
        dog.describe();
        System.out.println("Dog has fur: " + dog.hasFur());


    }
}
