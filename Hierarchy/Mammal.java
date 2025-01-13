package Hierarchy;

public class Mammal extends Animal{
    private boolean hasFur;

    //create constructor of Mammal
    public Mammal( boolean hasFur){
        this.hasFur=hasFur;
    }
    // Method to check if the mammal has fur
    public boolean hasFur() {
        return hasFur;
    }

    @Override
    public void describe(){
        System.out.println("Mummal hasFur: " + hasFur );
    }
}
