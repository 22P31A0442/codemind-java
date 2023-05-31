import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,i,j;
    x=sc.nextInt();
    for(i=1;i<=x;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
    System.out.print("
");
    }
    
 }
} 