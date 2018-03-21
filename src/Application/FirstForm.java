package Application;

import java.io.IOException;

import org.opencv.core.Core;

import Application.Ctrl.FirstForm_Ctrl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstForm extends Application {
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws IOException {
		//FXMLLoader loader = new FXMLLoader();
        //loader.setLocation(FirstForm.class.getResource("View/FirstForm_View.fxml"));	
       // Parent fxmlRoot;
		//Parent fxmlRoot = FXMLLoader.load(getClass().getResource("View/FirstForm_View.fxml")); 	 
			//fxmlRoot = loader.load();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("View/FirstForm_View.fxml"));
		
		Parent fxmlRoot = loader.load(); 
		Scene scene = new Scene(fxmlRoot);
		primaryStage.setTitle("JibFX Hello World");      	 
		primaryStage.setScene(scene);      	 
		// Show Stage
		primaryStage.show();
		FirstForm_Ctrl controller = loader.getController(); 
	
		       	    
		
        	  
	}	
}
