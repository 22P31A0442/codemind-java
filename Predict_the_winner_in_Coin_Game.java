import java.util.*;
public class solution
{
    public static void winner(int m,int n)
    {
        if(m%2==0||n%2==0)
        System.out.println("Player 1");
        else
        System.out.println("Player 2");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        winner(m,n);
    }
}