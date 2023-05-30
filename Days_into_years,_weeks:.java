import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,res,y,w,weeks;
    x=sc.nextInt();
    y=x/365;
    w=x%365;
    weeks=w/7;
    System.out.println(y);
    System.out.println(weeks);
 }
} 