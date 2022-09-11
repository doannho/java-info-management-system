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
	public String number;
	public Teacher(String n,String s,String no) {
		name=n;
		sex=s;
		number=no;
	}
}
class Course{
	String name;
	String time;
	int duration;
	String tname;
	public Course(String n,String t,int d,String techname) {
		name=n;
		time=t;
		duration=d;
		tname = techname;
	}
}

public class Main extends Application{
	public static ArrayList<Teacher>TechList = new ArrayList<>();
	public static ArrayList<Course>CourList = new ArrayList<>();
	public static void addTech(String name,String sex,String no) {
		TechList.add(new Teacher(name,sex,no));
	}
	public static void addCour(String name,String time,int duration,String techname) {
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
		for(Course i:CourList) {
			println("name:"+i.name+" time"+i.time+" duration:"+i.duration+" teacher:"+i.tname);
		}
	}
}

