package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller{
	@FXML
	Button addButton;
	@FXML
	Button TeacherInfo;
	@FXML
	TextField TeacherName;
	@FXML
	TextField TeacherSex;
	@FXML
	TextField TeacherNO;
	@FXML
	public void addAction(ActionEvent event) throws IOException{
		AnchorPane addPage = FXMLLoader.load(getClass().getResource("addinfo.fxml"));
		Stage addStage = new Stage();
		addStage.setTitle("add information");
		addStage.setScene(new Scene(addPage));
		addStage.show();
	}
	
	@FXML
	public void addTeacherInfoAction(ActionEvent event)throws IOException{
		String tname = TeacherName.getText();
		String tsex = TeacherSex.getText();
		int tno = Integer.parseInt(TeacherNO.getText());
		Main.addTech(tname, tsex, tno);
	}
	@FXML
	public void addCourseInfoAction(ActionEvent event)throws IOException{
		
	}
	
}
