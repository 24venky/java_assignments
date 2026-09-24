class Human
{
	double weight;
	double height;
	double age;
	double ratio(){
		return weight/height;
	}
	void display(){
		System.out.println("the age is:"+age);
	}
	Human(){
		weight=69;
		height=5.9;
		age=21;
	}
}
class Human3
{
	public static void main(String args[]){
		Human h =new Human();
		h.display();
		System.out.println("the ratio is"+h.ratio());
	}
}