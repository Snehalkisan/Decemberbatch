package AbstractClass;

public class Main {
    public static void main(String[] args) {
        // create a Fan object
        Fan fan =new Fan();
       // call the turnOn method from fan class
        fan.turnOn();
       // call the turnOff method (inherited from Appliance class)
        fan.turnOff();

    }
}
