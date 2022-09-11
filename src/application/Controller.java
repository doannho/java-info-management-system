package application;

import java.io.IOException;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller{
	
	
	@FXML
	Button addButton;
	@FXML
	Button TeacherInfo;
	@FXML
	Button CourseInfo;
	@FXML
	Button loadButton;
	
	@FXML
	TextField TeacherName;
	@FXML
	TextField TeacherSex;
	@FXML
	TextField TeacherNO;
	@FXML
	TextField CourseName;
	@FXML
	TextField CourseTime;
	@FXML
	TextField CourseDuration;
	@FXML
	TextField CourseTeacher;
	
	@FXML
	TableView<Course>courseTable;
	
	@FXML
	TableColumn namecol;
	@FXML
	TableColumn timecol;
	@FXML
	TableColumn duracol;
	@FXML
	TableColumn teaccol;
	
	@FXML
	public void addAction(ActionEvent event) throws IOException{
		AnchorPane addPage = FXMLLoader.load(getClass().getResource("addinfo.fxml"));
		Stage addStage = new Stage();
		addStage.setTitle("add information");
		addStage.setScene(new Scene(addPage));
		addStage.show();
	}
	@FXML
	public void seeAction(ActionEvent event)throws IOException{
		AnchorPane seePage = FXMLLoader.load(getClass().getResource("seeinfo.fxml"));
		Stage seeStage = new Stage();
		seeStage.setTitle("watch information");
		seeStage.setScene(new Scene(seePage));
		seeStage.show();
	}
	
	@FXML
	public void addTeacherInfoAction(ActionEvent event)throws IOException{
		String tname = TeacherName.getText();
		String tsex = TeacherSex.getText();
		String tno = TeacherNO.getText();
		Main.addTech(tname, tsex, tno);
	}
	@FXML
	public void addCourseInfoAction(ActionEvent event)throws IOException{
		String cname = CourseName.getText();
		String ctime = CourseTime.getText();
		int duration = Integer.parseInt(CourseDuration.getText());
		String cteacher = CourseTeacher.getText();
		Main.addCour(cname, ctime, duration,cteacher);
	}

	@FXML
	public void loadAction(ActionEvent event)throws IOException{
		ObservableList<Course>data = 
		
		FXCollections.observableArrayList(
				Main.CourList
				);
		namecol.setCellValueFactory(
		new PropertyValueFactory<>("name")
		);
		timecol.setCellValueFactory(
		new PropertyValueFactory<>("time")
		);
		duracol.setCellValueFactory(
		new PropertyValueFactory("duration")
		);
		teaccol.setCellValueFactory(
		new PropertyValueFactory("tname")
		);
		courseTable.setItems(data);
		//courseTable.getColumns().addAll(namecol,timecol,duracol,teaccol);		
	}
}
