import java.util.*;

public class Main
{
public static void main(String args[])
{
 int[] a=new int[5];
 Scanner sc= new Scanner(System.in);
 for(int i=0;i<5;i++)
 {
     a[i]=sc.nextInt();
 }
 int search=0,c=0,j=0;
 search=sc.nextInt();
 for(int i=0;i<5;i++)
 {
     if(search==a[i])
     {
         c++;
         j=i;
     }
 }
 if(c>0)
 {
     System.out.println(j+1);
 }
 else{
     System.out.println("-1");
 }
}
}