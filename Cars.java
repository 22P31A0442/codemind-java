import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,r,d;
    x=sc.nextInt();
    r=x%4;
    d=x/4;
    if(r==0)
        System.out.print(d);
    else if(r==1||r==2||r==3)
    System.out.println(d+1);
 }
} 