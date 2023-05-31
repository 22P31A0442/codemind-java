import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y;
    x=sc.nextInt();
    y=sc.nextInt();
    if((y-x)>0)
    System.out.println("Profit");
    else if((y-x)<0)
    System.out.println("Loss");
    else
    System.out.println("No profit and No loss");
 }
} 