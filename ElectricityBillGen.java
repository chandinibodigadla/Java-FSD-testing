
    import java.util.Scanner;
	public class ElectricityBillGen {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of units");
			int uts=sc.nextInt();
			if(uts<=100)
			{ 
				System.out.println("you dont pay the Bill");
			}
			else if(uts>100&&uts<=200)
			{
				uts=uts*5;
				System.out.println("above 100 can pay  "+uts+" rs per unit");
			}
			else if(uts>200&&uts<=300)
			{
				uts=uts*20;
				System.out.println("Above 200 has to pay  "+uts+" rs per unit");
			}
			else if(uts>300&&uts<=1000)
			{
				uts=uts*100;
				System.out.println("Above 300 to pay "+uts+" rs per unit");
			}
			else
			{
				System.out.println("Warning to get dissconnect the Power");	  

	}
		}
		
	}
