package ExceptionHandling;

public class Book {
    // initialise attributes of Library Book Rental System class
   private int bookId;
   private String title;
   private Boolean isAvailable;

   // create a constructor of Book class
    public Book(int bookId,String title)
    {
        this.bookId=bookId;
        this.title=title;
        this.isAvailable=true;

    }

    // method to rent book
    public void rentBook(){
        try {
            if(isAvailable){
                isAvailable=false;
                System.out.println("You have rented the book");
            }
            else {
                throw new Exception("Book is currently unavailable");
            }
        }
        catch (Exception e){
            System.out.println( e.getMessage() );

        }

    }
    // method to return book
    public void returnBook()
    {
        if(isAvailable = true){
            System.out.println("Book returned");
        }

    }

    public static void main(String[] args) {
        //create instance of book
        Book book1=new Book(1,"Flay High");
        Book book2=new Book(2,"The Way of success");
        System.out.println("Attempting to rent and return book1");
        book1.rentBook();
        book1.rentBook();
        book1.returnBook();
        book1.rentBook();
        System.out.println("=========================================");
        System.out.println("Attempting to rent and return book2");
      book2.rentBook();
      book2.rentBook();







    }




}
