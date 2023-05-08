import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sls=new Scanner(System.in);
        int n,i,a,b,c;
        n=sls.nextInt();
        for(i=0;i<n;i++)
        {
            a=sls.nextInt();
            b=sls.nextInt();
            c=a+b;
            System.out.println(c);
        }
        
    }
}