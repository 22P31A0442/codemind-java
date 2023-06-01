import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,x[],i,s=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
        x[i]=sc.nextInt();
        if(x[i]%2!=0)
        s=s+x[i];
    }
     System.out.print(s);
    
    
 }
} 