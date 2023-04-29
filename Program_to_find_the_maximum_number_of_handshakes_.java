import java.util.Scanner;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,handshakes;
        n=sc.nextInt();
        handshakes=(n*(n-1))/2;
        System.out.println(handshakes);
    }
}