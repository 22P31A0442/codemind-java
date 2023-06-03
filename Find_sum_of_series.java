import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    double n,i,s=0;
    n=sc.nextDouble();
    for(i=1;i<=n;i++)
    {
        s=s+(1/i);
    }
    System.out.format("%.2f",s);
 }
} 