import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,i,s=0,x[];
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
        x[i]=sc.nextInt();
        if(i%2==0)
        s=s+x[i];
    }
    System.out.println(s);
    
 }
} 