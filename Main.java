class Main 
{
	public static void main(String[] args) 
	{
		ShapeA circleshape = new Circle();
		circleshape.draw();
	}
}
interface ShapeA {
public String baseclass="shape";
public void draw();
}
interface ShapeB extends ShapeA {
public String baseclass="shape2";
public void draw2();
}
interface ShapeC {
public String baseclass="shape3";
public void draw3();
}
class Circle implements ShapeA,ShapeB,ShapeC
{
	public void draw2(){
		System.out.println("drawing circle here:"+ShapeB.baseclass);
  }
  public void draw(){
  System.out.println("drawing circle here:"+ShapeA.baseclass);
}
     public void draw3(){
		System.out.println("drawing circle here:"+ShapeC.baseclass);
  }
}