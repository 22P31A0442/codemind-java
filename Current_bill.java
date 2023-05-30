import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int u;
    double c,s,bill;
    u=sc.nextInt();
    if(u<=199)
    {
        c=u*1.20;
        if(c<400)
        s=100;
        else
        s=c*15/100;
    }
    else if(u>=200&&u<400)
    {
         c=u*1.50;
        if(c<400)
        s=100;
        else
        s=c*15/100;
    }
    else if(u>=400&&u<600)
    {
        c=u*1.80;
        if(c<400)
        s=100;
        else
        s=c*15/100;
    }
    else
    {
         c=u*2;
        if(c<400)
        s=100;
        else
        s=c*15/100;
    }
    bill=c+s;
    System.out.format("%.2f",bill);
 }
} 
