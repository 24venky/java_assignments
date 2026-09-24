interface Shape{
	public String baseclass="shape";
	public void draw();
}
class Circle implements Shape
{
	public void draw(){
		System.out.println("drawing circle here");
	}
}
public class OneInterfaceOneClass 
{
	public static void main(String[] args) 
	{
		 Shape circleshape=new Circle();
		 circleshape.draw();
	}
}
