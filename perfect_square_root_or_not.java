import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double m=Math.sqrt(n);
        if(m==(int)m)
        System.out.println("True");
        else
        System.out.println("False");
    }
}