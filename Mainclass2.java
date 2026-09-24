interface InheritMultiple
{
	String s1="this ";
}
interface Interface2
{
	String s2="is";
}
interface Interface3
{
	String s3="java";
}
interface Interface4
{
	String s4="world";
}
class Sub implements InheritMultiple,Interface2,Interface3,Interface4
{
	String s;
	Sub(){
		s=s1.concat(s2).concat(s3).concat(s4);
}
void display(){
	System.out.println(s);
}
}
class Mainclass2
{
	public static void main(String args[]){
		Sub s=new Sub();
		s.display();
	}
}