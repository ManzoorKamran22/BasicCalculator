package calculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		char operator;
		double answer = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Please enter your second number: ");
		num2 = sc.nextInt();
		
		System.out.println("What operation you want to perform: ");
		operator = sc.next().charAt(0);
		
		sc.close();
		
		
		switch (operator){
		case '+': answer = num1 + num2;
				  break;
		case '-': answer = num1 - num2;
		  		  break;
		case '*': answer = num1 * num2;
		          break;
		case '/': answer = num1 / num2;
		          break;  
		case '%': answer = num1 % num2;
				  break;
		   
		
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
		

	}

}
