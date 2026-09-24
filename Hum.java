class Human{
	double height;
	double weight;
	double age;
	void age(){
		System.out.println("your age is :"+age);

	}
	double ratio(){
		return weight/height;
	}
	void setVal(double h,double w, double a){
		height=h;
		weight=w;
		age=a;
	}
}
class Hum
{ 

	public static void main(String[] args) 
	{
		Human h1=new Human();
		Human h2=new Human();
		h1.setVal(6.5,70,21);
		h2.setVal(6.4,60,20);
		h1.age();
		h2.age();
     	System.out.println("ratio is"+h1.ratio());
			System.out.println(" ratio is"+h2.ratio());

	 
	}
}
