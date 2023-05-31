import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,c;
    x=sc.nextInt();
    y=sc.nextInt();
    c=21-x-y;
    if(c<=10&&c>=1)
    {
        System.out.print(c);
    }
    else
    System.out.println("-1");
    
 }
} 