
public class School {
String name;
String address;
String course;
int fee;
public School(String name, String address, String course, int fee) {
	super();
	this.name = name;
	this.address = address;
	this.course = course;
	this.fee = fee;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}

}
