package com.app.service;

import com.app.dto.CalculatorHistoryObj;

public interface CalculatorHis {
	public CalculatorHistoryObj addition(CalculatorHistoryObj calculatorHistoryObj);
	public  CalculatorHistoryObj subraction(CalculatorHistoryObj calculatorHistoryObj);
	public  CalculatorHistoryObj division (CalculatorHistoryObj calculatorHistoryObj);
	public CalculatorHistoryObj multiplication(CalculatorHistoryObj calculatorHistoryObj);

}
