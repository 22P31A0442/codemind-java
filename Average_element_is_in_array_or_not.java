import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,x[],s=0,avg,i,flag=0;
    n=sc.nextInt();
    x=new int[n];
    for(i=0;i<n;i++)
    {
     x[i]=sc.nextInt();
     s=s+i;
    }
    avg=s/n;
    for(i=0;i<n;i++)
    {
     if(avg==x[i])
     {
     flag=1;
     break;
     }}
 if(flag==1)
        System.out.print("True");
        else
        System.out.println("False");
    
 }
} 