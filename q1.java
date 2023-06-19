package lab5;
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         System.out.println("enter the first number");
         int m =sc.nextInt();
         System.out.println("enter the second number");
         int n =sc.nextInt();
         for(int i=m; i<=n;i++)
         {
        	 int fact=1;
        	 for(int j=m; j<=n;j++)
        	 {
        fact*=j;
        	 }
        	 System.out.println("factorial 07' + i +' is:" + fact);
        	 
        	 
         }
         
         
         
		

	}

}
