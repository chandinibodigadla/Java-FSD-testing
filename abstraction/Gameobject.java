package abstraction;
	public  abstract class Gameobject  {
		public abstract void  draw();
		public static void main(String[] args) {
			Gameobject Player =new Gameobject();
			Player.draw();
			Menu menu=new Menu();
			
			Menu.draw();
			}
		}

