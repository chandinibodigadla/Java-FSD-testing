package day3assignmaent;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int start=sc.nextInt();
		System.out.println("enter second number");
		int end=sc.nextInt();
		System.out.println("list of prime numbers between "+start+"and"+end);
		for(int i=start;i<=end;i++) {
			if(isprime(i)) {
		}

	}

}

	private static boolean isprime(int n) {
		if(n<=1) {
		return false;
	}
     for(int i=2;i<=Math.sqrt(n);i++) {
    	 if(n%i==0) {
    		 return false;
    	 }
     }
     return true;
	}
}