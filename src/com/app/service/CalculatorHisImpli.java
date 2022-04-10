package com.app.service;





import com.app.dto.CalculatorHistoryObj;

public class CalculatorHisImpli implements CalculatorHis {

	@Override
	public CalculatorHistoryObj addition(CalculatorHistoryObj calculatorHistoryObj) {
		calculatorHistoryObj.setResult(calculatorHistoryObj.getOpreand1()+calculatorHistoryObj.getOpreand2());
		return calculatorHistoryObj;
	}

	@Override
	public CalculatorHistoryObj subraction(CalculatorHistoryObj calculatorHistoryObj) {
		calculatorHistoryObj.setResult(calculatorHistoryObj.getOpreand1()-calculatorHistoryObj.getOpreand2());
		return calculatorHistoryObj;
	}

	@Override
	public CalculatorHistoryObj division(CalculatorHistoryObj calculatorHistoryObj) {
		calculatorHistoryObj.setResult(calculatorHistoryObj.getOpreand1()/calculatorHistoryObj.getOpreand2());
		return calculatorHistoryObj;
	}

	@Override
	public CalculatorHistoryObj multiplication(CalculatorHistoryObj calculatorHistoryObj) {
		calculatorHistoryObj.setResult(calculatorHistoryObj.getOpreand1()*calculatorHistoryObj.getOpreand2());
		return calculatorHistoryObj;
	}


}
