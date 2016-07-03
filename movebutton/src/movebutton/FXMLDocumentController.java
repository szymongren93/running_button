/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movebutton;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
     @FXML
    private Button button;

    @FXML
    private void handleButtonAction(ActionEvent event) {
          
    System.exit(0);
    }
    
@FXML
private void mouseEntered(MouseEvent event) {
 int x = (int) button.getLayoutX(); 
 
 if(x == 250) {
    button.setLayoutX(220);
    button.setLayoutY(0);
    
} else {
     button.setLayoutX(250);
    button.setLayoutY(0);    
     
     
 }

}

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}