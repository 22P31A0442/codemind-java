import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    char c;
    c=sc.next().charAt(0);
    int ch=c;
    if(ch>=65&&ch<=90)
    System.out.println("uppercase alphabet");
    else if(ch>=97&&ch<=122)
    System.out.println("lowercase alphabet");
    else
    System.out.println("not an alphabet");
 }
} 