import java.util.Scanner;
class MaxConsecutive {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for (int i=0;i<n;i++){
    a[i]=sc.nextInt();
  }

  int count=0;
  int max=0;

  for(int i=0;i<n;i++){
    if(a[i] == 1){
        count+=1;
        if(count>max){
            max=count;
        }
      }
     else {
            count=0;
        }
    
  }
  System.out.println(max);
  sc.close();

    }
    
}
