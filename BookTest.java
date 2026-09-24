package mypack.pack;
class  Book
{
	String bookname;
	String author;
	Book(String b,String c)
	{
		this.bookname=b;
		this.author=c;
	}
	public void show()
	{
		System.out.println(bookname+" "+author);
	}
}
class BookTest
{
	public static void main(String[] args) 
	{
		Book b=new Book("java","herbert");
		b.show();
		System.out.println("Hello World!");
	}
}
