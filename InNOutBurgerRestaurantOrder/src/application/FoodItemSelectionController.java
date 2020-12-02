package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FoodItemSelectionController {
	
	static double orderTotal = 0;
	
	/**
	 * This method is called via the order now button on the startup scene
	 * When the button is clicked, we start our order and we are
	 * taken to the next scene where we can select food items
	 * SOURCE: https://youtu.be/XCgcQTQCfJQ 
	 * @param event
	 * @throws IOException
	 */
	public void cancelButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("InNOutBurgerUI.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
	}
	
	public void continueButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("CartScene3.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
		
		
	}
	
	public double burger1() {
		return orderTotal += 3.45;
	}
	
	public double burger2() {
		return orderTotal += 2.40;
	}
	
	public double burger3() {
		return orderTotal += 2.10;
	}
	
	public double fries() {
		return orderTotal += 1.60;
	}
	
	public double drink1() {
		return orderTotal += 2.00;
	}
	
	public double drink23() {
		return orderTotal += 1.50;
	}
	
//	public static double getTotal() {
//		return orderTotal;
//	}
	
	public static String getTotal() {
		return "$"+ orderTotal;
	}

}