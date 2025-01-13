package ProductInventoryManagement;

public class Main {
    public static void main(String[] args) {
        // create product instance
        Product Headphone = new Product(101 ," Headphone ", 15);
        Product table = new Product(102 ," Table ", 20);

        //Displaying initial product details
        System.out.println("Initial Details of Product : ");
        Headphone.diplayProductDetails();
        table.diplayProductDetails();

         //Updating quantities with valid values
        System.out.println("===========================================================");
        System.out.println("Updating quantities with valid values: ");
        Headphone.update(15);
        table.update(30);
        System.out.println("===========================================================");
        //Updating quantities with  invalid values
        System.out.println("Attempting to add invalid values");
        Headphone.update(-5);
        table.update(-5);
        System.out.println("===========================================================");
        System.out.println("displaying the updated details of product");
        Headphone.diplayProductDetails();
        table.diplayProductDetails();

    }
}
