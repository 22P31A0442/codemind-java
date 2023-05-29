import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,s=0,i,x[];
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
       x[i]=sc.nextInt();
       if(i%2==0)
      {
          if(x[i]%2!=0)
          s=1;
      }
    }
    if(s==1)
    System.out.println("False");
    else
    System.out.println("True");
 }
} 
