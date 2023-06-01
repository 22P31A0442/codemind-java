import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,x[],i,s=0,f=0,avg;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
        x[i]=sc.nextInt();
        s=s+x[i];
    }
    avg=s/n;
    for(i=0;i<n;i++)
    {
        if(x[i]<=avg)
        f++;
    }
    System.out.println(f);
    
 }
} 