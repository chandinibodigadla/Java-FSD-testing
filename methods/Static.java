package methods;

public class Static {
	int y=100; //instance variable
	static int x=200; //static variable
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	static void show()
	{
		System.out.println("chandini");
	}
	public static void main(String[] args) {
		Static obj=new Static();
		obj.display(); //normal method calling with reference
		show(); // calling static method
	}
}
