package mru.tsc.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;


public class myGUI {
	public myGUI(Stage primaryStage){
		try {
			
			//Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ToyStoreScene.fxml")); 
			FXMLLoader loader = new FXMLLoader();
			Parent root = loader.load(getClass().getClassLoader().getResource("ToyStoreScene.fxml")); 
			//loader.setController(root);
			//loader.getController(mru.tsc.view.Controller);
			Scene home = new Scene(root);
			
			//Controller cont = (Cont) chanceScene("ToyStoreScene.fxml");
			home.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			home.getStylesheets().add("application.css");
			primaryStage.setScene(home);
			primaryStage.show();
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
