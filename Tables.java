import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,n,i,res;
        a=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
            res=a*i;
            System.out.println(a+" x "+i+" = "+res);
            }
        }
    }
}