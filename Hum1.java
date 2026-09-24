class Human 
{
	double weight;
	double height;
	double age;
	double ratio(){
	return weight/height;	
	}
	void display()
	{
		System.out.println("age is :"+age);
	}
	Human(double w,double h,double a)
	{
		weight=w;
		height=h;
		age=a;
	}
}
	class Hum1
	{
	public static void main(String[] args) 
	{
		Human h=new Human(56,6.6,21);
		h.display();
		System.out.println("the ratio is: "+h.ratio());
	}
}
