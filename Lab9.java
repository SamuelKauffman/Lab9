
public class Lab9 {
private String name;
private int age;
private String major;
private String hobby;
private double expectedGPA;
private int TimeSpent;

public Lab9(String name, int age, String major, String hobby, double expectedGPA, int TimeSpent){
	this.name=name;
	this.age=age;
	this.major=major;
	this.hobby=hobby;
	this.expectedGPA=expectedGPA;
	this.TimeSpent=TimeSpent;
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
	return expectedGPA;
}
public int gettime() {
	return TimeSpent;
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
public void setGPA(double expectedGPA) {
	this.expectedGPA=expectedGPA;
}
public void settime(int TimeSpent) {
	this.TimeSpent=TimeSpent;
}
public String honors() {
	if(this.expectedGPA > 3.5) {
		return "Valid";
	}
	return "Invalid";
}
public static void main(String[] args) {
	Lab9 Student= new Lab9 ("Sam", 19, "CS", "Skateboard", 3.6, 10);
	System.out.println(Student.honors());
}
}
