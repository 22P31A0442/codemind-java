import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,d,s=0,f=0;
    n=sc.nextInt();
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        if(d%2!=0)
        s++;
        else
        f++;
    }
   if(s==0&&f>0)
   System.out.println("Even");
   else if(s>=0&&f==0)
   System.out.println("Odd");
   else
   System.out.println("Mixed");
 }
} 