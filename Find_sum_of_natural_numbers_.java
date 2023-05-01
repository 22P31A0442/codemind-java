import java.util.Scanner;
public class PrintFibonacci
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,s=0;
		n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
          s=s+i; 
        }
          System.out.println(s);
        
	}
}