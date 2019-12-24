
public class Patient {
	String name;
	double weight;
	double height;
	double BMI(String n,double w,double h)
	{
		this.name=n;
		this.weight=w;
		this.height=h;
		double k;
		k=w/(height*height)*(703);
		return k;
	
	}

}
//////////////////////////

public class Patients {

	public static void main(String[] args)
	{
		Patient p=new Patient();
		p.BMI("DASTAGIR", 200, 70);
		System.out.println(p.BMI("DASTAGIR", 200, 70));
	}
	
}
