package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;


public class PasswordController {

	@FXML
    private PasswordField Password;

    @FXML 
    private Button Button;

    @FXML
    void handleButtonPress(ActionEvent event) {	
    	if (Password.getText() = "bugaboo"){
    		System.out.println("Correct");	
    	}
    	
    	else{System.out.println("Wrong");

    	}
    }
}
