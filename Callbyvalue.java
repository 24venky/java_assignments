class Test
{
	void math(int i,int j){
		i*=2;
		j/=3;
	}
}
class Callbyvalue
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		int a=15;
		int b=34;

		System.out.println("a and b before call:"+a+" "+b);
		t.math(a,b);
System.out.println("a and b after call:"+a+" "+b);
}
}