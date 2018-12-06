package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoanCalculatorController {

	@FXML 
	Button btnCal;
	
	@FXML 
	Label lblMonthlyInstallments;
	
	@FXML 
	Label lblResult;
	
	@FXML 
	TextField  txtAmount;
	
	@FXML 
	TextField  txtInterest;
	
	@FXML 
	TextField  txtDuration;
	
	@FXML 
	private void btnCalculate() {
		
		double result;
		
		if(txtAmount.getText() != null || txtDuration.getText() != null || txtInterest.getText() != null) {
			double amount = Double.parseDouble(txtAmount.getText());
			double interest = Double.parseDouble(txtInterest.getText());
			double duration = Double.parseDouble(txtDuration.getText());
		
			if(txtAmount.getText() == null || txtDuration.getText() == null || txtInterest.getText() == null) {
				lblResult.setText("Please fill in all the fields!");
			}
			else if(amount < 0) {
				lblResult.setText("Amount cannot be negative!");
			}
			else if(interest < 2 || interest > 5) {
				lblResult.setText("Interest value should be between 2 and 5!");
			}
			else if(duration < 3 || duration > 7) {
				lblResult.setText("Duration should be betweeen 3 and 7!");
			}
			else {
					result=(amount*interest*duration)/1200;
					lblResult.setText("The result is: " + result);
			}
		}
		else {
			lblResult.setText("Please fill in all the fields!");
		}
	}
}
