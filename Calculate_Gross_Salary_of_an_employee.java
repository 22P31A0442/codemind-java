import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    float x,y,z,pf,gs;
    x=sc.nextFloat();
    y=sc.nextFloat();
    z=sc.nextFloat();
    pf=x*12/100;
    gs=x+y+z+pf;
    System.out.format("%.2f
",pf);
    System.out.format("%.2f",gs);
 }
} 