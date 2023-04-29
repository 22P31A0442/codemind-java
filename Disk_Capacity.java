import java.util.Scanner;
public class solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tracks,sectors,blocks,capacity;
        tracks=sc.nextInt();
        sectors=sc.nextInt();
        blocks=sc.nextInt();
        capacity=2*tracks*sectors*blocks*512;
        System.out.println(capacity);
    }
}