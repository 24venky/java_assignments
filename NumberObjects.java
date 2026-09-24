class NumberObjects 
{
	static int count=0;
	NumberObjects()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		 NumberObjects o1=new NumberObjects();
		 NumberObjects o2=new NumberObjects();
		 NumberObjects o3=new NumberObjects();
		 NumberObjects o4=new NumberObjects();
		 System.out.println("number of objects created:"+count);
	}
}
