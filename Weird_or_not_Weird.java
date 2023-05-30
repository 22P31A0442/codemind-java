import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x;
    x=sc.nextInt();
    if(x%2==0&&x>=6&&x<=20)
    System.out.println("weird");
    else if(x%2!=0)
    System.out.println("weird");
    else
    System.out.println("not weird");
 }
} 