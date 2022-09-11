package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

import javax.swing.JFrame;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main extends Application{
	public static FileOutputStream twriter;
	public static FileOutputStream cwriter;
	public static void CreateWriter()throws IOException{
		twriter = new FileOutputStream("TData.txt");
		cwriter = new FileOutputStream("CData.txt");
	}
	public static ArrayList<Teacher>TechList = new ArrayList<>();
	public static ArrayList<Course>CourList = new ArrayList<>();
	public static void addTech(String name,String sex,String no) throws IOException {
		twriter.write((name+' '+sex+' '+no+'\n').getBytes());
		TechList.add(new Teacher(name,sex,no));
	}
	public static void addCour(String name,String time,int duration,String techname) throws IOException {
		cwriter.write((name+' '+time+' '+duration+' '+techname+'\n').getBytes());
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
		CreateWriter();
		launch(args);
	}
}

