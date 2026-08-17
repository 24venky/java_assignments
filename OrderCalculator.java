import java.util.Scanner;
 class OrderCalculator{
    public int calculateSubtotal(int price,int quality){
        if((1<= price && price<=10000) && (0<= quality && quality <=100)){
            return price*quality;
        }
        else{
            System.out.println("price is out of range");
            return 0;
        }
        
        
    }
    public int calculateFinaltotal(int subtotal,int deliverycharge)
    {
        if(0<= deliverycharge && deliverycharge <=1000){
        return subtotal+ deliverycharge;
    }
    else{
        System.out.println("delivery charge is out of range");
        return 0;
    }
    }

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   int price=sc.nextInt();
   int  quality=sc.nextInt();
   int  deliverycharge=sc.nextInt();
          
    OrderCalculator o=new OrderCalculator();
    int subtotal= o.calculateSubtotal(price,quality);
    int Finaltotal= o.calculateFinaltotal(subtotal,deliverycharge);
    System.out.println(" subtotal is"+subtotal);
    System.out.println("finaltotal is:"+Finaltotal);
    sc.close();
   }
}