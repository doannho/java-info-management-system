package application;

public class Teacher{
	public String name;
	public String sex;
	public String number;
	public Teacher(String n,String s,String no) {
		name=n;
		sex=s;
		number=no;
	}
	public String getname() {
		return name;
	}
	public String getsex() {
		return sex;
	}
	public String getnumber() {
		return number;
	}
}