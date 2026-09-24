import java.util.Scanner;
public class Box2
{
int length;
int breadth;
int height;
	 Box2(int length,int breadth,int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public void display(double area,double area1){
		 
		System.out.println("area of a rectangle is :"+area);
		System.out.println("area1 of a rectangle is :"+area1);
	}
  
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter the length :");
	 int len=sc.nextInt();
	 System.out.print("enter the breadth:");
	 int bre=sc.nextInt();
	 System.out.print("enter the height:");
	 int hei=sc.nextInt();
	  System.out.print("enter the length :");
	 int len1=sc.nextInt();
	 System.out.print("enter the breadth:");
	 int bre1=sc.nextInt();
	 System.out.print("enter the height:");
	 int hei1=sc.nextInt();
	 Box2 b=new Box2(len,bre,hei);
	  Box2 b1=new Box2(len1,bre1,hei1);
	 double area=len*bre*hei;
	  double area1=len1*bre1*hei1;

	 b.display(area,area1);
	 

	 
		 sc.close();


	}
}
