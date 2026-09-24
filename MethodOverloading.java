 class DisplayOverloading
 {
	 public void disp(char c){
		 System.out.println(c);
	 }
	 public void disp(char c,int num){
		 System.out.println(c+" "+num);
	 }
	 }
	 class MethodOverloading
	 {
	 public static void main (String args[]){
		 DisplayOverloading d=new DisplayOverloading();
		 d.disp('p');
		 d.disp('k',21);

	 }
 }