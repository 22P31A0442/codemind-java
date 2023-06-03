import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,i,x[],s=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
    x[i]=sc.nextInt();
    double d=Math.sqrt(x[i]);
    int sq=(int)d;
    if(sq==d)
    s=s+x[i];
    }
    System.out.print(s);
 }
} 