import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    float res;
    int x,y;
    x=sc.nextInt();
    y=sc.nextInt();
    res=(x+y);
    
    System.out.format("Average of %d and %d is: %.2f ",x,y,res/2);
 }
} 