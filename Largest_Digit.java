import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sls=new Scanner(System.in);
        int n,d,max=0;
        n=sls.nextInt();
        while(n!=0)
    {
        d=n%10;
        n=n/10;
        if(max<d)
        max=d;
    }
    System.out.print(max);
    }
}