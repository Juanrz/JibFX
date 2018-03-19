package Application.Ctrl;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;


public class FirstForm_Ctrl {
	 
	    @FXML
	    private Text actiontarget;
	 
	    @FXML
	    protected void submit(ActionEvent event) {
		actiontarget.setText("登入成功");
	    }
	
}
