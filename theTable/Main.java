package theTable;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	@Override
	public void start(Stage stage) 
	{			
        Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("BlackjackVisual_V1.fxml"));
	        Scene scene = new Scene(root);
	        
	        stage.setTitle("Blackjack Table");
	        stage.setScene(scene);
	        stage.show();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

			
	}
	
	public static void main(String[] args) 
	{
		launch(args);	
	}
	
	
}
