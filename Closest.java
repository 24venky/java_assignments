import java.util.Scanner;
import java.lang.*;
public class Closest{
    public static void main (String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for (int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
  }
  int target=sc.nextInt();
  int closer=a[0];
  for(int i=0;i<a.length;i++){
  long currentDifference = Math.abs((long) a[i]-target);
  long closerDifference = Math.abs((long) closer-target);
  if(currentDifference < closerDifference){
    closer=a[i];
  }
  else if(currentDifference==closerDifference && a[i] < closer){
    closer=a[i];
  }
  }
  System.out.println(closer);
  sc.close();
    }
}