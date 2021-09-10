package currencyconversion;
import java.io.*;
import java.util.scanner;
public class currencyconverter{
  public static void main(strings[]args){
    double Rs;
    scanner in=new scanner(system.in);
    system.out.println("choose the type of cuurency convertion");
    system.out.println("1.USDollar to INDrupees,2.Euro to INDRupees,3.Japanese Yen to INDRupees");
    int ch=in.nextlnt();
    switch(ch)
    {
        case1:    system.out.println("Dollar to Rupees conversion");
                  system.out.println("Enter the numbers of Dollars");
                  double dollar=in.nextln();
                  Rs=dollar*67.02;
                  system.out.println("USD="+dollar+"is INR="+Rs);
                  break;
        case2:    system.out.println("EURO to Rupees conversion");
                  system.out.println("Enter the number of EURO");
                  double Euro=in.nextln();
                  Rs=Euro*78.29;
                  system.out.println("Euro="+Euro+"is INR="+Rs);
                  break;
        case3:    system.out.println("Japanese Yen to Rupees conversion");
                  system.out.println("Enter the number of Yen");
                  double Yen=in.nextInt();
                  Rs=Yen*0.61;
                  system.out.println("Yen="+Yen+"is INR="+Rs);
                  break;
