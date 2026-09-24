class Test 
{
	int a ,b;
	Test(int i , int j){
		a=i;
		b=j;
	}
	void math(Test o){
		o.a*=2;
		o.b/=3;
		
	}
}
class Callbyref
{
	public static void main(String[] args) {

	Test t=new Test(15,30);
		System.out.println("before call:"+t.a+" " +t.b);
		System.out.println("after call:"+t.a+" " +t.b);
	}
}
