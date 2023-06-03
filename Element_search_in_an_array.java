import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,i,x[],s=0,z;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
    x[i]=sc.nextInt();
    }
    z=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(z==x[i])
        {
        s++;
        }
    }
    if(s>=1)
    System.out.println("True");
    else
    System.out.println("False");
 }
} 