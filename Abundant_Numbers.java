import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,count=0;
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            count=count+i;
        }
        if(count>=n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}