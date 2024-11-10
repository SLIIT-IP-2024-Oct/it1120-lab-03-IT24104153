import java.util.Scanner;
  public class IT24104153Lab3Q4{
   public static void main(String[]args){

     int number;

     Scanner value=new Scanner(System.in);
     System.out.print("enter a five digit number");
     number=value.nextInt(); 

     String digit=Integer.toString(number); 

     for(int i=0;i<digit.length();i=i+1){   
     System.out.print(digit.charAt(i) + " "); 
}
}
}