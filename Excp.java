class Excp
{
	public static void main(String args[])
	{
		int a,b,c;
		try{
			a=0;
			b=19;
			c=b/a;
			System.out.println("this line will not executed");
		}
		catch(ArithmeticException e){
         System.out.println("division by zero ");
		}
		System.out.println("afer exception is handled");

	}
}