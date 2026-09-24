import java.util.Scanner;
class Example
{
	int age;
	int roll;
	String name;
	public Example(){
		this.age=age;
		this.roll=roll;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 Example e = new Example();
		int age=sc.nextInt();
		int roll=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
       
		System.out.println("the age is :"+age);
		System.out.println("the roll number is:"+roll);
		System.out.println("the name is :"+name);
		 
	}
}
