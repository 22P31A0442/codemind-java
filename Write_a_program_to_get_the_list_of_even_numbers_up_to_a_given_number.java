import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,i;
    x=sc.nextInt();
    y=sc.nextInt();
    for(i=x;i<=y;i++)
    {
        if(i%2==0)
        System.out.print(i+" ");
    }
    
 }
} 