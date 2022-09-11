package application;

import javafx.beans.property.SimpleStringProperty;

public class Teacher{
	private final SimpleStringProperty name;
	private final SimpleStringProperty sex;
	private final SimpleStringProperty number;
	public Teacher(String n,String s,String no) {
		name=new SimpleStringProperty(n);
		sex=new SimpleStringProperty(s);
		number=new SimpleStringProperty(no);
	}
	public String getName() {
		return name.get();
	}
	public String getSex() {
		return sex.get();
	}
	public String getNumber() {
		return number.get();
	}
}