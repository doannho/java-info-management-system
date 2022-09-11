package application;

import javafx.beans.property.SimpleStringProperty;

public class Teacher{
	private final SimpleStringProperty Name;
	private final SimpleStringProperty Sex;
	private final SimpleStringProperty Number;
	public Teacher(String n,String s,String no) {
		Name=new SimpleStringProperty(n);
		Sex=new SimpleStringProperty(s);
		Number=new SimpleStringProperty(no);
	}
	public String getName() {
		return Name.get();
	}
	public String getSex() {
		return Sex.get();
	}
	public String getNumber() {
		return Number.get();
	}
}