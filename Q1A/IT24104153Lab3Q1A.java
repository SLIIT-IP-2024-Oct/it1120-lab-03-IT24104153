import java.util.Scanner;
  public class IT24104153Lab3Q1A{
   public static void main (String []args){

      double Price,NoOfKilos,APay;
      Scanner ToPay=new Scanner(System.in);

      System.out.println("Price");
      Price=ToPay.nextDouble();

      System.out.println("NoOfKilos");
      NoOfKilos=ToPay.nextDouble();

      APay=NoOfKilos*Price;

      System.out.println("total pay :" + APay);
}
}
      

