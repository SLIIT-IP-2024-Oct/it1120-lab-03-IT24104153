import java.util.Scanner;
  public class IT24104153Lab3Q1B{
   public static void main (String []args){

      double Price,NoOfKilos,APay,FinalPay;
      Scanner ToPay=new Scanner(System.in);
      

      System.out.println("Price");
      Price=ToPay.nextDouble();                          

      System.out.println("NoOfKilos");
      NoOfKilos=ToPay.nextDouble();

      APay=NoOfKilos*Price;
      
      FinalPay=(APay*10/100);

      System.out.println("Final pay after discount :" + FinalPay);
}
}
      

