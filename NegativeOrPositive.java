package Practice;
import java.util.Scanner;
public class NegativeOrPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no to check positive or negative:");
         n=sc.nextInt();
         sc.close();
         if(n>0)
         {
        	 System.out.println("Positive");
         }
         else {
        	 System.out.println("Neagative");
         }
	}

}
