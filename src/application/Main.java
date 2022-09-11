package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

class Teacher{
	public String name;
	public String sex;
	public int number;
	public Teacher(String n,String s,int no) {
		name=n;
		sex=s;
		number=no;
	}
}
class Course{
	String name;
	String time;
	String duration;
	public Course(String n,String t,String d) {
		name=n;
		time=t;
		duration=d;
	}
}

public class Main extends Application{
	public static ArrayList<Teacher>TechList = new ArrayList<>();
	public static ArrayList<Course>CourList = new ArrayList<>();
	public static void addTech(String name,String sex,int no) {
		TechList.add(new Teacher(name,sex,no));
	}
	public static void addCour(String name,String time,String duration) {
		CourList.add(new Course(name,time,duration));
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
	public static void main(String[]args) {
		launch(args);
//		HashMap<Teacher,Course>schedule;
//		System.out.println("Choose an option:\n"
//				+"1.Insert Info\n"
//				+"2.Search Info\n"
//				);
//		Scanner sc = new Scanner(System.in);
//		int option = sc.nextInt();
//		if(option==1) {
//			println("Please input the teacher name:");
//			String tname;
//			tname = sc.next();
//			println("Please input the teacher sex:");
//			String tsex;
//			tsex = sc.next();
//		}
		for(Teacher i:TechList) {
			println("name:"+i.name+" sex:"+i.sex+" NO.:"+i.number);
		}
	}
}

