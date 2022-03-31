package day3assignmaent;

public class Fibinacci {

	public static void main(String[] args) {
		int n=10;
		int firstTerm = 0;
		int secondTerm= 1;
		System.out.println("fibonacci series till" + n +"terms:");
		for(int i=0; i<n; i++) {
			System.out.println(firstTerm + "");
			int nextTerm=firstTerm + secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
		

	}

}
