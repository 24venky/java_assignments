  import java.util.Calendar;
import java.util.Date;

public class Calendar1 { 
    public static void main(String[] args) { 
        
        Calendar c = Calendar.getInstance(); 
        

        c.set(2025, 6, 5); 
        Date firstDate = c.getTime(); 
        
        c.set(2024, 8, 1); 
        Date secondDate = c.getTime(); 
        
        System.out.println("is first date before second date: " + firstDate.before(secondDate)); 
        System.out.println("is first date after second date: " + firstDate.after(secondDate)); 
    } 
}