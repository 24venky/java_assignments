import java.util.Scanner;
public class Employee{
    String name;
    String role;
    public Employee()
    {
         role="Trainee";
       
    }
    public void displayProfile()
    {
        System.out.println(" Employee Name :"+name);
        System.out.println("Employee Role:"+role);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        e.name=sc.nextLine();
        e.displayProfile();
        sc.close();

    }   
}