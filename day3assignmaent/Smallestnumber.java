package day3assignmaent;
import java.util.Scanner;
public class Smallestnumber {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter three numbers:");
		a=Sc.nextInt();
		b=Sc.nextInt();
		c=Sc.nextInt();
	   d=c< (a<b ? a:b)? c:((a<b)? a:b);
	   System.out.println("smallest three numbers:"+d);

	}

}
