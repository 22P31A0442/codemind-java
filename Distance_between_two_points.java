import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int x1,x2,y1,y2;
    double res;
    x1=sc.nextInt();
    y1=sc.nextInt();
    x2=sc.nextInt();
    y2=sc.nextInt();
    res=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    System.out.format("%.4f",res);
 }
} 