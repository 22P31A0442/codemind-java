import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,i,s=0;
    x=sc.nextInt();
    for(i=1;i<=x/2;i++)
    {
        if(x%i==0)
        s=s+i;
    }
    System.out.println(s);
 }
} 