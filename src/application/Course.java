package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Course{
	private final SimpleStringProperty name;
	private final SimpleStringProperty time;
	private final SimpleIntegerProperty duration;
	private final SimpleStringProperty tname;
	public Course(String n,String t,int d,String techname) {
		name=new SimpleStringProperty(n);
		time=new SimpleStringProperty(t);
		duration=new SimpleIntegerProperty(d);
		tname = new SimpleStringProperty(techname);
	}
	public String getName() {
		return name.get();
	}
	public String getTime() {
		return time.get();
	}
	public int getDuration() {
		return duration.get();
	}
	public String getTname() {
		return tname.get();
	}
}