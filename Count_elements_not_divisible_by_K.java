import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,i,x[],s=0,m;
    n=sc.nextInt();
    m=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
    x[i]=sc.nextInt();
    if(x[i]%m!=0)
    s++;
    }
    System.out.println(s);
 }
} 