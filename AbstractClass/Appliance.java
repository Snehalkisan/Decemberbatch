package AbstractClass;
   //abstract class
abstract class Appliance {
   // Abstract method(no implementation)
    abstract void turnOn();
    // Non -Abstract method(with implementation)
    void turnOff(){
        System.out.println("Appliance turned off");
    }
}
