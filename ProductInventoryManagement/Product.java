package ProductInventoryManagement;

public class Product
{
    private int productID;
    private String productName;
    private int quantity;
//constructor to initiate product attributes
    public Product(int productID,String productName,int quantity)
    {
        this.productID=productID;
        this.productName=productName;
        this.quantity=quantity;
    }
    //create method to update product quantity
    public void update(int add)
    {

        try {

            if (add <= 0) {

            throw new IllegalArgumentException("Quantity can not be negative");
            }
            this.quantity +=add;
            System.out.println("Updated quantity of "+ productName + "is" + this.quantity );
            System.out.println("===========================================================");
        }
          catch(IllegalArgumentException e )
                    {
                System.out.println("handling the exception " +  e.getMessage());


            }

        System.out.println("ProductId: "  +  " ProductName: " + productName + " ProductQuantity: " + quantity);
        System.out.println("===========================================================");


    }

   // method to display product details
    public void diplayProductDetails(){
        System.out.println("ProductID: " + productID + "ProductName: " + productName + "Quantity: " + quantity);
    }

}
