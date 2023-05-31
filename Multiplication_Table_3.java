import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,z,i,res;
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    for(i=y;i<=z;i++)
    {
        res=x*i;
        System.out.println(x+" x "+i+" = "+res);
    }
    
 }
} 