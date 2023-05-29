import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,x[],i,s=0,avg,count=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
        x[i]=sc.nextInt();
        s=s+x[i];
    }
    for(i=0;i<n;i++)
    {
        avg=s/n;
        if(x[i]>=avg)
        {
            count++;
        }
    }
    System.out.println(count);
 }
} 