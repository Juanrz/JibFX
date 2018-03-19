package Application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstForm extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(FirstForm.class.getResource("View/FirstForm_View.fxml"));	
        Parent fxmlRoot;
		try {
			fxmlRoot = loader.load();
			Scene scene = new Scene(fxmlRoot);
       	 
      	    primaryStage.setTitle("JavaFX Hello World");
      	 
      	    primaryStage.setScene(scene);
      	 
      	    // Show Stage
      	    primaryStage.show();
		} catch (IOException e) {
			// TODO 自動產生的 catch 區塊
			e.printStackTrace();
		}        	    
        	 
        	  
	}	
}
