import java.util.Scanner;
  public class IT24104153Lab3Q2{
   public static void main(String[]args){

    double OTamount,OThourlyrate,Totalsalary,Monthlysalary;
    int OThours;

    Scanner salary=new Scanner(System.in);

    System.out.print("input the monthly salary : Rs");
    Monthlysalary=salary.nextDouble();

    System.out.print("number of OT hours:");
    OThours=salary.nextInt();

    System.out.print("OT hourly rate:");
    OThourlyrate=salary.nextDouble();

    OTamount=OThours*OThourlyrate;
    Totalsalary=Monthlysalary+OTamount;

    System.out.println("Total salary including OT is:Rs"+Totalsalary);
}
}