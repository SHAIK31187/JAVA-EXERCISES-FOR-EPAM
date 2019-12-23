public class Main
{
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0,avg=0;
		for(int i=0;i<10;i++)
		{
		    sum+=a[i];
		}
		avg=sum/10;
		System.out.println("sum is:"+sum);
		System.out.println("avg is :"+avg);
	}
}