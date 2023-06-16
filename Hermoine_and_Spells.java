import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b>a+c&&a+b>b+c)
        System.out.println(a+b);
        else if(b+c>a+b&&b+c>a+c)
        System.out.println(b+c);
        else
        System.out.println(c+a);
    }
}