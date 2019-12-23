
class Main1 {
  public static void main(String[] args) {
  int a[]={5,8,9,3,4,7},c=0,temp;
    for(int i=0;i<5;i++)
    {
      c=i;
      for(int j=i+1;j<6;j++)
      {
        if(a[j]<a[c])
          c=j;
      }
      temp=a[c];
      a[c]=a[i];
      a[i]=temp;   
    }
    for(int i=0;i<6;i++)
    {
      System.out.println(a[i]);
    }
    
  }
}
