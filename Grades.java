import java.util.*;
public class solution
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n=5,x[],i,s,p=0;
    x=new int[n];
    for(i=0;i<5;i++)
    {
        x[i]=sc.nextInt();
        p=p+x[i];
    }
    s=p/5;
    if(s>=90)
    System.out.println("Grade A");
    else if(s<=90&&s>=80)
    System.out.println("Grade B");
     else if(s<=80&&s>=70)
    System.out.println("Grade C");
     else if(s<=70&&s>=60)
    System.out.println("Grade D");
     else if(s<=60&&s>=40)
    System.out.println("Grade E");
    else
    System.out.println("Grade F");
    
 }
} 