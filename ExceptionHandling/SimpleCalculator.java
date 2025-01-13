package ExceptionHandling;
 //initialise attributes
public class SimpleCalculator {
   private int a;
   private int b;
    int c;
    int d;
    int e;
    int f;

 // create constructor of Simple Calculator class
   public SimpleCalculator(int a,int b){
       this.a=a;
       this.b=b;

   }
   public void add(){
       c=a+b;
       System.out.println("Addition of a and b is : " + c);
   }
     public void subtract(){
         d=a-b;
         System.out.println("Subtraction of a and b is : " + d);
     }
     public void multiply(){
         e=a*b;
         System.out.println("Multiplication of a and b is : " + e);
     }
     public void division(){
       try {
          if (b==0){
              throw new ArithmeticException("Cannot divide by zero.");
          }
           f=a/b;
           System.out.println("Division of a and b is: " +f);

       }
       catch (ArithmeticException e){
           System.out.println(e);
       }

     }

     public static void main(String[] args) {
         //create instance of Simple calculator
         SimpleCalculator calculator1=new SimpleCalculator(12,6);
         SimpleCalculator calculator2=new SimpleCalculator(5,0);

         //Performing arithmetic operations
         System.out.println("============================================");
         System.out.println("Performing arithmetic operations: "  );
         calculator1.add();
         calculator1.subtract();
         calculator1.multiply();
         calculator1.division();
         System.out.println("============================================");
         System.out.println("Performing arithmetic operations having divisor zero: ");
         calculator2.add();
         calculator2.subtract();
         calculator2.multiply();
         calculator2.division();


     }


}
