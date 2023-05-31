import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x,y,i,s=0;
    x=sc.nextInt();
    y=sc.nextInt();
    for(i=x;i<=y;i++)
    {
        if(i%3==0)
        s++;
    }
    System.out.println(s);
 }
} 