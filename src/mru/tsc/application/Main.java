package mru.tsc.application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import mru.tsc.view.myGUI;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

//change the application as necessary and add your own code
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		myGUI gui=new myGUI(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
