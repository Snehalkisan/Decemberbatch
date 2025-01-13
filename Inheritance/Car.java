package Inheritance;

public class Car extends Vehicle{
    // brand and model property
    private String Brand;
    private String model;

    //create constructor of Car class
    public Car(String brand,String model,int speed){
        super(speed);
        this.Brand=brand;
        this.model=model;
    }

    @Override
    public void displayInfo(){
        System.out.println("Brand: " + Brand + " Model: " + model + " Speed: " + speed + "km/h");

    }

}
