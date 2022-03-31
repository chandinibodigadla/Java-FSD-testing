package day3assignmaent;
import java.util.Scanner;
public class Ternaryoperators {

	public static void main(String[] args) {
		 int a,b,c,
     Scanner sc=new Scanner(System.in);
     System.out.println("enter all three numbers:");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     d=c> (a>b ? a:b)? c:((a>b)? a:b);
     System.out.println("greatest three number:"+d);
     
	}
	

}
