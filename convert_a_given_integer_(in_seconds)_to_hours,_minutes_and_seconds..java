import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,h,m,s;
    x=sc.nextInt();
    h=x/3600;
    m=(x%3600)/60;
    s=((x%3600)%60);
    System.out.println("H:M:S-"+h+":"+m+":"+s);
 }
} 