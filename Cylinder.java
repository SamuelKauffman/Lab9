
public class Cylinder {
private double radius;
private double height;
public Cylinder(double radius, double height) {
	this.height=height;
	this.radius=radius;
}
public double getHeight() {
	return height;
}
public double getradius() {
	return radius;
}
public void setHeight(double height) {
	this.height=height;
}
public void setWidth(double radius) {
	this.radius=radius;
}
public double areaCylinder() {
	return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius, 2));
}
public double VolumeCylinder() {
	return (Math.PI*Math.pow(radius, 2))*height;
}
public static void main(String[] args) {
	Cylinder Cylinder1 = new Cylinder(10,5);
	System.out.println("The Area is: " + Cylinder1.areaCylinder());
	System.out.println("The volume is: " + Cylinder1.VolumeCylinder());
}
}
