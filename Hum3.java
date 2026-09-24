class Human{
	double height;
	double weight;
	double age;
	void feature(){
		System.out.println("ratio:");
		System.out.println(weight/height);
		System.out.println("age is:"+age);
	}

		}
	class Hum3
	{
	public static void main(String[] args) 
	{
		Human h1=new Human();
		Human h2=new Human();
		h1.height=5.6;
		h1.weight=65;
		h1.age=21;
		h2.height=5.8;
		h2.weight=67;
		h2.age=22;
		 h1.feature();
		 h2.feature();
	}
}
