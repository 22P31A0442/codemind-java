import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int n,r,i,found=0;
		    n= sc.nextInt();
		    int x[]=new int[10];
		    while(n>0)
		    {
		        r=n%10;
		        x[r]++;
		        n=n/10;
		    }
		    for(i=0;i<9;i++)
		    {
		        if(x[i]>1)
		          {
		              found=1;
		              break;
		          }
		    }
		    if(found==0)
		       System.out.println("Unique Number");
		    else
		       System.out.println("Not Unique Number");
		}}