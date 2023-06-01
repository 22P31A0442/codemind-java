import java.util.*;
public class solution
{
    public static void main(String args[])
    {
        Scanner sls=new Scanner(System.in);
        int n,m,i,j,s,a[][];
    n=sls.nextInt();
    m=sls.nextInt();
    a=new int[n][m];
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            a[i][j]=sls.nextInt();
        }
    }
    for(i=0;i<n;i++)
    {
        s=0;
        for(j=0;j<m;j++)
        {
            s=s+a[i][j];
        }
    System.out.print(s+" ");
    }
    }
}