import java.util.Scanner;
 public class PrintFibonacci
{
	public static void printFib(int n)   
	{
		int a=0,b=1,c,i; 
		System.out.print(a+" "+b+" ");
		c=a+b;
		for(i=0;i<(n-2);i++)
		{
			System.out.print(c+" ");
            a=b;
			b=c;
			c=a+b;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printFib(n);
	}
}