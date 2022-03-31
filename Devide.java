import java.util.Scanner;

public class Devide {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number A");
		int num1=sc.nextInt();
		
		System.out.println("Enter number B");
		int num2=sc.nextInt();
		
		int ans=num1/num2;
		System.out.println("A divided by B :" +ans);
		

	}

}
