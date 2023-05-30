import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=5,m,i,flag=0;
    for(i=0;i<n;i++)
    {
        m=sc.nextInt();
        if(m<34)
        {
       flag=1;
        break;
        }
    }
    if(flag==1)
     System.out.println("FAILED");
     else
        System.out.println("PASSED");
    
    
 }
} 