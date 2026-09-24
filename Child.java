class GrandParent{
	int a;
	GrandParent(int a){
		this.a=a;
	}
	}
	class Parent extends GrandParent{
		int b;
		Parent(int a,int b)
	{
			super(a);
			this.b=b;
	}
	void show(){
		System.out.println("grandparent a:"+a);
		System.out.println("parent b:"+b);
	}
	}
  class Child
  {

	public static void main(String[] args) 
	{
		Parent p=new Parent(12,13);
		p.show();
	}
}
