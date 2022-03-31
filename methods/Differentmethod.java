package methods;

public class Differentmethod {
	public void method1() { //method declaration
		System.out.println("this method without parameters...");
	}
	public void method2(int a) {
		System.out.println("one parameter method..."+a);
	}
	public int add (int a,int b) { //created a method return int value
		int sum=a+b; //logic
		return sum;
	}
	public void add1(int c,int d) {
		int sum=c+d;
		System.out.println("sum of c add d is :"+sum);
	}
	public static void main(String[] args) {
		//create an object
		int n1=20;
		int n2=30;
		Differentmethod obj1=new Differentmethod(); // object created
		obj1.method1();
		obj1.method2(1234);
		int total=obj1.add(n1, n2);
		System.out.println("sum of a and b is:"+total);
		obj1.add(10,20);
		obj1.add1(100,200);
		
		
		
		
		
	
		
		
	}

}
