import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,h,m;
    x=sc.nextInt();
    h=x/60;
    m=x%60;
    System.out.println(h+" Hour(s) "+m+" Minute(s)");
 }
} 