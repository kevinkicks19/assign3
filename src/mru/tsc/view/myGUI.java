package mru.tsc.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;


public class myGUI {
	public myGUI(Stage primaryStage){
		try {
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ToyStoreScene.fxml")); 
			Scene home = new Scene(root);
			//home.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//home.getStylesheets().add("application.css");
			primaryStage.setScene(home);
			primaryStage.show();
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
