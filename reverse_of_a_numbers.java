import java.util.Scanner;
public class Solution
{
  public static String findReverse(String str)
  {
	  char ch[]=str.toCharArray();
	  String reverse="";
	  for(int i=0;i<ch.length;i++)
	  {
	     reverse=ch[i]+reverse;
	  }
	  return reverse;
  }
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 String line=sc.nextLine();
	 String rev=findReverse(line);
	 System.out.println(rev);
  }
}

