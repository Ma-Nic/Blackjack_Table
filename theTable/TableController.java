/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theTable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author Peggy Fisher
 */
public class TableController implements Initializable {
    
    @FXML
    private Label label;
    @FXML 
    private Text actiontarget;
    
    @FXML
    private void twistHand(ActionEvent event) {
        actiontarget.setText("Twist button was pressed");
    }

    @FXML
    private void stickHand(ActionEvent event) {
        actiontarget.setText("Stick button was pressed");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
