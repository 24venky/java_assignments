import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int small=a[0];
        int secondSmall=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<small){
                secondSmall=small;
                 small=a[i];
            }
            else if(a[i]<secondSmall){
                secondSmall=a[i];
            }
        }
        System.out.println(secondSmall);
        sc.close();
    }

    
}
