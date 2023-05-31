import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sls=new Scanner(System.in);
    int x,y,i,gcd=0;
    x=sls.nextInt();
    y=sls.nextInt();
    for(i=1;i<=x||i<=y;i++)
    {
        if(x%i==0&&y%i==0)
        gcd=i;
    }
    System.out.print(gcd);
    
 }
} 
