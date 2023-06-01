import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sls=new Scanner(System.in);
        int n;
    do
    {
        n=sls.nextInt();
     if(n!=(-1))
     System.out.println(n*n);
     else
     break;
    }while(n!=(-1));
    }
}