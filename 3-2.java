import java.util.*;

public class Main
{
public static void main(String args[])
{
 int a[]={1,2,3,4,5,6,7,8,9,10};
 int max=0,min=1000;
 for(int i=0;i<10;i++)
 {
     if(max<a[i])
     {
         max=a[i];
     }
     if(min>a[i])
     {
         min=a[i];
     }
 }
 System.out.println("MIN :"+min);
  System.out.println("MIN :"+max);
}
}