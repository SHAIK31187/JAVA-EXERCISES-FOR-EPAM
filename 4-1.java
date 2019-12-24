public class Box {
	double height;
	double width;
	double depth;
  /*void box(double h,double w,double d)
  {
    this.height=h;
    this.width=w;
    this.depth=d;
  }*/
  void volume(double height,double width,double depth)
  {
    System.out.print(height*width*depth);
  }
}
//////////////////////
public class Function
{
  public static void main(String[] args)
  {
    Box b = new Box();
    //b.box();
    b.volume(25.2,25.2,25.2);
  }
}