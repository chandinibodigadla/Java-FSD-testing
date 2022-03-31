package methodoverloading;

public class Human {
	public void eat()
	
	{
		System.out.println("human is eating");
		
	}
	class Boy extends Human{
		public void eat() {
			System.out.println("Boys is eating");
			
		}
		public static void main(String[] args) {
			Human obj;
			obj.eat();
			Human obj1=new Human();
		}
	}

}
