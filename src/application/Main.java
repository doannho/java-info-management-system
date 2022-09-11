package application;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;



public class Main extends Application{
	public static ArrayList<Teacher>TechList = new ArrayList<>();
	public static ArrayList<Course>CourList = new ArrayList<>();
	public static void addTech(String name,String sex,String no) throws IOException {
		Files.write(Paths.get("TData.txt"),(name+' '+sex+' '+no+'\n').getBytes(),StandardOpenOption.APPEND);
		TechList.add(new Teacher(name,sex,no));
	}
	public static void addCour(String name,String time,int duration,String techname) throws IOException {
		Files.write(Paths.get("CData.txt"),(name+' '+time+' '+duration+' '+techname+'\n').getBytes(),StandardOpenOption.APPEND);
		CourList.add(new Course(name,time,duration,techname));
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("config.fxml"));
			primaryStage.setTitle("Info-MS");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void println(String s) {
		System.out.println(s);
	}
	public static void main(String[]args) throws IOException {	
		launch(args);
	}
}

