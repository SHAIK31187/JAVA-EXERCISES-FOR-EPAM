import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int[] a =new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          a[j]=-1;
        }
      }
    }
    for(int i=0;i<a.length;i++)
    {
     if(a[i]==-1)
     {
       continue;
     }
      else
      {
        System.out.print(a[i]+" ");
      }
    }
  }
}