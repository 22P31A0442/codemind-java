import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,n,c,b;
        n=sc.nextInt();
        if(n==0||n==1)
        System.out.println("True");
        else
        {
            a=0;
            b=1;
            c=a+b;
        while(c<n)
        {
          a=b;
          b=c;
          c=a+b;
        }
        if(c==n)
        System.out.println("True");
        else
        System.out.println("False");
        }
    }
}