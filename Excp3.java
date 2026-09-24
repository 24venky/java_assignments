 class Excp3
{
	public static void main(String args[]){
		try{
			int a[]={1,2,0,4,5};
			try{
			int x=a[1]/a[2];
			}
		catch(ArithmeticException e){
		System.out.println("division by zero is not possible");	
		}
		a[6]=3;
		}
		catch(ArrayIndexOutOfBoundsException e){
         System.out.println("array index is out of bound exception ");
		}

	}
}