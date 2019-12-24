import java.util.*;
class Main {
  public static void main(String[] args) {
int n,k=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] a = new int[n];
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
          k=a[j];
        }
      }
    }
    System.out.print(k);
    
  }
}
