package core.java.basic;

import java.util.Scanner;

public class GettingUSerInput_ScannerClass_Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Integer value getting from user
		
		System.out.println("Please Enter a value");
		int a =sc.nextInt();
		
		
	
		System.out.println("Please Enter b value");
		int b =sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("A sum of a+b is: "+sum);

		System.out.println("-----------------------------------------------");
		
		//Float vlaue getting from user
		System.out.println("Enter you Float Value");
		float f1 = sc.nextFloat();
		
		System.out.println("enter you Second Float value");
		float f2 = sc.nextFloat();
		
		float sumf3=f1+f2;
		
		System.out.println("A sum of f1 and f2 is :"+sumf3);
		
		System.out.println("-------------------------------------------------");
		
		// Double value getting from user
		
		System.out.println("Please enter first Double value");
		double d1=sc.nextDouble();
		
		System.out.println("Please enter second double value");
		double d2=sc.nextDouble();
		
		double sumd3=d1+d2;
		
		System.out.println("A sum of double value is :"+sumd3);
		
		System.out.println("-------------------------------------------------------");

		System.out.println("Please enter your name");
		String name = sc.nextLine();
		
		System.out.println("Your name is :"+name);
		
		
		
	}

}
