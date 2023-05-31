import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,z,a,b;
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    a=x%(y*z);
    b=x/(y*z);
    if(a==0)
    System.out.print(b);
    else
    System.out.println(b+1);
 }
} 