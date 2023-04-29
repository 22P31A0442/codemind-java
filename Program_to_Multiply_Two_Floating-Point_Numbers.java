import java.util.Scanner;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,multi;
        a=sc.nextFloat();
        b=sc.nextFloat();
        multi=a*b;
        System.out.format("%.2f",multi);
    }
}