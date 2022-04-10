package com.app.service;

import java.util.LinkedList;

import com.app.dto.CalculatorHistoryObj;

public class CalculatorRepoImpli {
	LinkedList<String> ll = new LinkedList<String>(); 
	
	public CalculatorHistoryObj saveHistroy(CalculatorHistoryObj calculatorHistoryObj) {
		ll.add(calculatorHistoryObj.toString());
		return calculatorHistoryObj;
	}

	public void getHistroy() {
		
		if (ll.size()==0) {
			System.out.println("No calculation done yet. Please do some math to see history");
		}
		else {
		for (int i = 0; i < ll. size(); i++) {
			System. out. println("opreation No ."+ i +" = "+ll. get(i));
	}
	
		
	}
		}
	}
	
	
	


