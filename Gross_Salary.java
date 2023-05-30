import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x;
    double a,b,c;
    x=sc.nextInt();
   if(x<=10000)
   {
    a=0.8;
    b=0.2;
   }
   else if(x>=10000 && x<=20000)
   {
       a=0.9;
       b=0.25;
   }
   else
   {
       a=0.95;
       b=0.3;
   }
   c=x+(a*x)+(b*x);
    System.out.format("%.2f",c);
 }
} 