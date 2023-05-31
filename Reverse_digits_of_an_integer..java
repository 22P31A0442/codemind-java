import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,n,d,s=0;
    x=sc.nextInt();
    n=x;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        s=s*10+d;
    }
    System.out.println(s);
    
 }
} 