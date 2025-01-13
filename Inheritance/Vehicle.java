package Inheritance;

public class Vehicle {
    // speed property
    protected int speed;

    //create a constructor of vehicle class
     public Vehicle(int speed){
         this.speed=speed;
     }

     //create method to display info
    public void displayInfo(){
        System.out.println("Speed " + speed +"km/h");

    }
}
