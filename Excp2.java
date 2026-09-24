class Excp2
{
	public static void main(String args[]){
		try{
			int a[]={1,2};
			a[2]=3/0;
		}
		catch(ArithmeticException e){
		System.out.println("division by zero is not possible");	
		}
		catch(ArrayIndexOutOfBoundsException e){
         System.out.println("array index is out of bound exception ");
		}
	}
}