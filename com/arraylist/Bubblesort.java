package arraylist;
import java.util.Scanner;
public class Bubblesort {
public static void main(String[] args) {
	int i,j,k,swap;
	Scanner sc=new Scanner(System.in);
	System.out.println("input number of integers to sort");
	i=sc.nextInt();
	int array[]=new int[i];
	System.out.println("enter"+ i +"integer");
	for(j=0; j<i; j++) {
		array[j]=sc.nextInt();
		for(j=0;j<(i-1);j++){
			for(k=0;k<i-j-1;k++) {
				swap =array[k];
				array[k]=array[k+1];
			}
		}
		System.out.println("sorted list of numbers");
		for(j=0;j<i;j++)
			System.out.println(array[j]);
	}
		
	
}
}
