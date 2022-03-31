package day3assignmaent;
import java.util.Scanner;
public class Arthematicoperator {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter any two positive interger numbers:");
	    int a=sc.nextInt();
	    int b=sc.nextInt();  
	     float div;
	     int add1 = a+b;
	     int sub1 =a-b;
	     int mul2=a*b;
	     int rem3=a%b; 
	     float div4=a/b;
	    System.out.println("addition:"+add1);
	    System.out.println("substraction:"+sub1);
	    System.out.println("multiplication:"+mul2);
	    System.out.println("remainder:"+rem3);
	    System.out.println("division:"+div4);

	}

}
