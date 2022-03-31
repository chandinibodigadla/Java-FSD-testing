package methods;

import controlFlow.Methodconcept;

public class Methodsconcept {
   // create a method
	public void myfirstmethod() {
		System.out.println("this is my first method...");
	}
	  //create  second method
	public void mysecondmethod() {
		System.out.println("this is my second method....");
	}
	public static void main(String[] args) {
		//how to call method...you have to create an object
		Methodsconcept obj=new   Methodsconcept();
	    obj.myfirstmethod();
	    obj.mysecondmethod();
	}
}
