class Box
{
double length;
double height;
double breath;
}
class Box1
{
public static void main (String args[])
{
   Box b=new Box();
double area;
b.length=14.5;
b.height=13.5;
b.breath=12.3;
area=(2*b.length*b.height*b.breath);
System.out.println("area is:"+area);
}
}