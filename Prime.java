import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,s=0,i;
    x=sc.nextInt();
    for(i=1;i<x/2;i++)
    {
        if(x%i==0)
        s++;
    }
    if(s==1)
    System.out.println("Prime");
    else
    System.out.println("Not Prime");
    
 }
} 