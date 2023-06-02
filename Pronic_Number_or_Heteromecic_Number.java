import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,flag=0,i;
    n=sc.nextInt();
    for(i=0;i<n/2;i++)
    {
        if(i*(i+1)==n)
        {
        flag=1;
        break;
        }
        else
        flag=0;
    
    }
    if(flag==1)
    System.out.println("YES");
    else
    System.out.println("NO");
    
 }
} 