import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,i,s=0,f=0,a,d;
    x=sc.nextInt();
    for(i=1;i<=x;i++)
    {
        s=s+i;
    }
    a=s*s;
    for(i=1;i<=x;i++)
    {
        f=f+(i*i);
    }
    d=a-f;
    System.out.println(d);
    
 }
} 