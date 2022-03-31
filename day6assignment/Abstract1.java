package day6assignment;
 public abstract class Abstract1 {
    public void disp() {
    	System.out.println("concrete method of parent class");
    }
    abstract public void disp2();
}
 public class Demo extends Abstract1 {
	public void disp2()
	{
		System.out.println("overriding abstract methods");
	}

	public static void main(String[] args) {
	  Demo obj=new Demo();
	  obj.disp2();

	}

}
