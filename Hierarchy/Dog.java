package Hierarchy;

public class Dog extends Mammal{
    public  Dog(){
        super(true);//dogs have fur
    }
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }

}
