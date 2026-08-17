import java.util.Scanner;
public class Student2{
    String name;
    public void setName(String name){
         this.name=name;
    }
    public void showName(){
        System.out.println("the name is:"+name);
    }
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
       Student2 s=new Student2();
       s.name=sc.nextLine();
       s.setName(s.name);
       s.showName();
       sc.close();
    }
    
}