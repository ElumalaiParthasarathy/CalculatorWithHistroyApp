package com.app;


import java.util.Scanner;

import com.app.dto.CalculatorHistoryObj;
import com.app.service.CalculatorHisImpli;
import com.app.service.CalculatorRepoImpli;


public class CalculatorAppWithHistory {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		String check ;

		CalculatorHisImpli cal = new CalculatorHisImpli();
		CalculatorRepoImpli cr = new CalculatorRepoImpli();
		
			do {
				
				System.out.println("Do you want to see history type -- 1"+ "\nDo you want make operation type -- 2"+"\nDo you want to close type -- 3");
					int  check1 =scanner.nextInt();
					
				switch (check1) {
					case 1:
						 cr.getHistroy(); 
					break;
					
					case 2:
				System.out.println("Enter the operation");
				String opreation= scanner.next().toLowerCase();

				System.out.println("Enter The Oprend1 ");
				int opreand1 =  scanner.nextInt();

				System.out.println("Enter the oprend2 ");
				int opreand2 =  scanner.nextInt();
				
				
				CalculatorHistoryObj calculatorObj = new CalculatorHistoryObj(opreand1, opreand2, opreation);
				

				switch (opreation) {	
				case "add"  :
					cal.addition(calculatorObj);
					cr.saveHistroy(calculatorObj);
					break;
				case "sub":
					cal.subraction(calculatorObj);
					cr.saveHistroy(calculatorObj);
					break;
				case "mul":
					cal.multiplication(calculatorObj);
					cr.saveHistroy(calculatorObj);
					break;
				case "div":
					cal.division(calculatorObj);
					cr.saveHistroy(calculatorObj);
					break;
				}
				
				System.out.println(calculatorObj.toString());
				break;
				
					case 3:
						System.out.println("Thank you.Application closing");
						System.exit(0);;
						break;
						
			}
				System.out.println("Do you want to make another calculation or see history : yes/no");
				check = scanner.next().toLowerCase();
			}while (check.equals("yes"));
			System.out.println("Thank you");
			scanner.close();
	}}
			
	
	
	

			
	








	





