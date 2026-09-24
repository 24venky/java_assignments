 class InheritSingle
 {
	 protected String s;
	 InheritSingle(){
		 s="java";
	 }
 }
 class SubClass extends InheritSingle {
	 SubClass(){
		 s=s.concat("world");
	 }
	 void display(){
		 System.out.println(s);
	 }
 }
 class MainClass
 {
	 public static void main(String args[]){
		 SubClass sb=new SubClass();
		 sb.display();
	 }
 }
