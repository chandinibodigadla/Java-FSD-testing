package abstraction;

public  abstract class Gameobject  {
public abstract void  draw();
public static void main(String[] args) {
	Player Player=new Player();
	Player.draw();
	Menu menu=new Menu();
	
	Menu.draw();
	}
}
