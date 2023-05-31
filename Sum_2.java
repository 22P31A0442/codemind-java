import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int a,b,x,y,i,s=0;
    a=sc.nextInt();
    b=sc.nextInt();
    x=sc.nextInt();
    y=sc.nextInt();
    for(i=a;i<=b;i++)
    {
        if(i%x==0&&i%y!=0)
        {
            s=s+i;
        }
    }
    System.out.println(s);
    
 }
} 
