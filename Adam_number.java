import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n,sq,rsq,s=0,ss=0,d,dd;
    n=sc.nextInt();
    sq=n*n;
    while(n!=0)
    {
        d=n%10;
        s=s*10+d;
        n=n/10;
    }
    rsq=s*s;
    while(rsq!=0)
    {
        dd=rsq%10;
        ss=ss*10+dd;
        rsq=rsq/10;
    }
    if(sq==ss)
    System.out.println("True");
    else
    System.out.println("False");
 }
} 