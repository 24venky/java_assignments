 class InheritMultilevel
 {
	 protected String s;
	 InheritMultilevel(){
		 s="j";
	 }
 }
 class Sub1 extends InheritMultilevel
 {
	 Sub1(){
		 s=s.concat("a");
	 }
 }
	  class Sub2 extends   Sub1
 {
	 Sub2(){
		 s=s.concat("v");
	 }
 }
	  class Sub3 extends  Sub2
 {
	 Sub3(){
		 s=s.concat("a");
	 }
	 void display(){
		 System.out.println(s);
	 }
	 }
	 class Mainclass1
	 {
		 public static void main(String args[]){
         Sub3 s3 =new Sub3();
		 s3.display();
			 
	 }


 }