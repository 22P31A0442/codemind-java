import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,z,s;
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    s=y*1+z*2;
    if(s>=x)
    System.out.println("Qualify");
    else
    System.out.println("Not Qualify");
    
 }
} 
