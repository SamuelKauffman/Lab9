
public class Student21 {
private String name;
private int age;
private String major;
private String hobby;
private double gpa;
private int timeSpent;

public Student21() {
	this.name="";
	this.age=0;
	this.major="";
	this.hobby="";
	this.gpa=0;
	this.timeSpent=0;
}
public Student21(String name, int age, String major, String hobby, double gpa, int timeSpent) {
	this.name=name;
	this.age=age;
	this.major=major;
	this.hobby=hobby;
	this.gpa=gpa;
	this.timeSpent=timeSpent;
}
public String getname() {
	return name;
}
public int getage() {
	return age;
}
public String getmajor() {
	return major;
}
public String gethobby() {
	return hobby;
}
public double getgpa() {
	return gpa;
}
public int gettime() {
	return timeSpent;
}
public void setname(String name) {
	this.name=name;
}
public void setage(int age) {
	this.age=age;
}
public void setmajor(String major) {
	this.major=major;
}
public void sethobby(String hobby) {
	this.hobby=hobby;
}
public void setGPA(double gpa) {
	this.gpa=gpa;
}
public void settime(int timeSpent) {
	this.timeSpent=timeSpent;
}
public String HonorsEligible() {
	String Honors;
	if(this.gpa>=3.5)
		Honors="You are honors eligible!";
	else
		Honors="You are not honors eligible!";
	return Honors;
}
public static void main(String[] args) {
	Student21 Student = new Student21();
	Student.setname("Sam");
	Student.setage(19);
	Student.setmajor("CS");
	Student.sethobby("Skateboarding");
	Student.setGPA(3.4);
	Student.settime(10);
	System.out.println("Students honors check year one: " + Student.HonorsEligible());
	Student.setGPA(3.6);
	System.out.println("Student honors check year two: " + Student.HonorsEligible());
}
}
