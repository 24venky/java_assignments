class NumberRangeException extends Exception
{
	String msg;
	NumberRangeException(){
		msg=new String("enter a number between 20 and 100");
	}
}
public class MyException
{
	public static void main(String args[]){
		try{
			int x=10;
			if(x<20||x>100)throw new NumberRangeException();
		}
		catch(NumberRangeException e){
			System.out.print(e);
		}
	}
}