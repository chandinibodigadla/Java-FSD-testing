package constructor;
class Main {
	int i;
	//constructor with no parameter
	Main() {
		i=5;
	 System.out.println("constructor is called");			
	}

	public static void main(String[] args) {
		//calling the constructor without any parameter
		Main obj=new Main();
		System.out.println("value of i:"+obj.i);

	}

}
