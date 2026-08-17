import java.util.Scanner;
public class Employee1{
    int id;
     String name;
     String department;
     public Employee1(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;

     }
     public void displayProfile(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee  Name:"+name);
        System.out.println("Employee department:"+department);

     }
     public static void main(String args[]){

     Scanner sc=new Scanner(System.in);
     int id=sc.nextInt();
     sc.nextLine();

     String name=sc.nextLine();
     
     String department=sc.nextLine();
     
    Employee1 e1 =new Employee1(id,name,department);
      e1.displayProfile();
     sc.close();
     }
}