import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,i,res;
    x=sc.nextInt();
    y=sc.nextInt();
    for(i=1;i<=y;i++)
    {
        res=i*x;
        System.out.println(x+" x "+i+" = "+res);
    }
    
 }
} 
