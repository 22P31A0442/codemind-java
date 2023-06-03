import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,i,x[],f=1;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
    x[i]=sc.nextInt();
    f=f*x[i];
    }
    for(i=0;i<n;i++)
    {
    System.out.print(f/x[i]+" ");
    }
 }
} 