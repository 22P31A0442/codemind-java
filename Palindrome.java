import java.util.Scanner;
public class String4
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
  public static boolean isPalindrome(String str1)
  {
      String str2=findReverse(str1);
	  if(str1.equalsIgnoreCase(str2))
	      return true;
	  else 
	      return false;
  }
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 String line=sc.nextLine();
	 if(isPalindrome(line))
	    System.out.println("True");
	 else 
	    System.out.println("False");
  }
}
