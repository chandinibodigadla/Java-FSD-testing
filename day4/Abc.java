package day4;

public class Abc {
	static int add(int a,int b) {  //add method with 2 parameters
		return a+b;
	}
	static int add (int a, int b,int c) {
		return a+b+c;
	}
}
   class Methodoverloading {
	public static void main(String[] args) {
		System.out.println(Abc.add(10,20));
		System.out.println(Abc.add(50,60));

	}

}
