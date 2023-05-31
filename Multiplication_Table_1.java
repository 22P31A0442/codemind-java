import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,i,res;
    x=sc.nextInt();
    for(i=1;i<=12;i++)
    {
        res=i*x;
        System.out.println(x+" x "+i+" = "+res);
    }
    
 }
} 