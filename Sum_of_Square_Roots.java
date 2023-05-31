import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sls=new Scanner(System.in);
    int x,y,i;
    double s=0;
    x=sls.nextInt();
    y=sls.nextInt();
    for(i=x;i<=y;i++)
    {
        s=s+Math.sqrt(i);
    }
    System.out.format("%.2f",s);
 }
} 
