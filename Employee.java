
public class Employee {
private String firstname;
private String lastname;
private String position;
private double salary;
private double hours;

public Employee(String firstname, String lastname, String position, double salary, double hours) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.position=position;
	this.salary=salary;
	this.hours=hours;
}
public Employee() {
	this.firstname="";
	this.lastname="";
	this.position="";
	this.salary=8.25;
	this.hours=0;
}
public String getfirstname() {
	return firstname;
}
public String getlastname() {
	return lastname;
}
public String getposition() {
	return position;
}
public double getsalary() {
	return salary;
}
public double gethours() {
	return hours;
}
public void setfirstname() {
	this.firstname=firstname;
}
public void setlastname() {
	this.lastname=lastname;
}
public void setposition() {
	this.position=position;
}
public void setsalary() {
	this.salary=salary;
}
public void sethours() {
	this.hours=hours;
}
public double ShowCurrentPay() {
	double pay;
	double overtime = 0;
	if(this.hours<=40)
		pay=this.hours*this.salary;
	else
		overtime=this.hours-40;
		pay=(40*this.salary)+(overtime*this.salary*1.5);
	return pay;
}
public String DisplayPayCheck() {
	StringBuilder sb= new StringBuilder();
	sb.append("=====" + firstname.toLowerCase() + " " + lastname.toLowerCase() + "=====");
	sb.append("\nHours Worked: " + hours);
	sb.append("\nPosition: " + position);
	sb.append("\nSalary: " + salary);
	sb.append("\nTotal pay: " + this.ShowCurrentPay());
	
	return sb.toString();
}
public static void main(String[] args) {
	Employee person1=new Employee("Sam","Kauffman","The Boss",20,30);
	System.out.println(person1.DisplayPayCheck());
	Employee person2=new Employee("Johnny","Allen","The peasant",40,50);
	System.out.println(person2.DisplayPayCheck());
}
}
