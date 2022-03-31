package com.batch.scanner;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		int i;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter any interger value:");
		if(Sc.hasNextInt()) {
			i=Sc.nextInt();
			System.out.println("entered value is an interger");	
		}
		else {
			System.out.println("entered number is not an integer number:");	
		} 	
		}

	}

