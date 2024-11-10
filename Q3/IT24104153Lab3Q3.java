import java.util.Scanner;
  public class IT24104153Lab3Q3{
   public static void main(String[]args){

     int rupeeamount,notes;

     Scanner amount=new Scanner(System.in);

     System.out.print("enter amount: Rs");
     rupeeamount=amount.nextInt();

     int Notes5000=rupeeamount/5000;
     rupeeamount=rupeeamount-Notes5000*5000;
     int Notes1000=rupeeamount/1000;
     rupeeamount=rupeeamount-Notes1000*1000;
     int Notes500=rupeeamount/500;
     rupeeamount=rupeeamount-Notes500*500;
     int Notes200=rupeeamount/200;
     rupeeamount=rupeeamount-Notes200*200;
     int Notes100=rupeeamount/100;
     rupeeamount=rupeeamount-Notes100*100;
     int Notes50=rupeeamount/50;
     rupeeamount=rupeeamount-Notes50*50;
     int Notes20=rupeeamount/20;
     rupeeamount=rupeeamount-Notes20*20;
     int Notes10=rupeeamount/10;
     rupeeamount=rupeeamount-Notes10*10;
     int Notes05=rupeeamount/05;
     rupeeamount=rupeeamount-Notes05*05;
     int Notes02=rupeeamount/02;
     rupeeamount=rupeeamount-Notes02*02;
     int Notes01=rupeeamount/01;
     rupeeamount=rupeeamount-Notes01*01;
     
     System.out.println("5000 Notes: "+Notes5000 + "\n1000 Notes: "+ Notes1000 + "\n500 Notes: "+ Notes500 + "\n200 Notes: "+Notes200 + "\n100 Notes: "+Notes100+ "\n50 Notes: "+Notes50+ "\n20 Notes: "+Notes20 + "\n10 Notes: "+Notes10 + "\n5 Notes: "+Notes05 + "\n2 Notes: "+Notes02 + "\n1 Notes: "+Notes01);
}
}

     