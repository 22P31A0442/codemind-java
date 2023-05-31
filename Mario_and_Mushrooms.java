import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x;
    x=sc.nextInt();
    if(x%3==1)
    System.out.print("HUGE");
    else if(x%3==2)
    System.out.println("SMALL");
    else
    System.out.println("NORMAL");
    
 }
} 