import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,d,s=0,f=1;
    n=sc.nextInt();
    while(n!=0)
    {
        d=n%10;
        s=s+d;
        f=f*d;
        n=n/10;
    }
    if(s==f)
    System.out.println("Spy Number");
    else
     System.out.println("Not Spy Number");
    
 }
} 