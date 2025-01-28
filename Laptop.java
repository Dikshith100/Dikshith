import java.util.Arrays;

public class Laptop {
String[] model;
String[] name;
String[] processor;
int ram;
int price;
public Laptop(String[] model, String[] name, String[] processor, int ram, int price) {
	super();
	this.model = model;
	this.name = name;
	this.processor = processor;
	this.ram = ram;
	this.price = price;
}
public String[] getModel() {
	return model;
}
public void setModel(String[] model) {
	this.model = model;
}
public String[] getName() {
	return name;
}
public void setName(String[] name) {
	this.name = name;
}
public String[] getProcessor() {
	return processor;
}
public void setProcessor(String[] processor) {
	this.processor = processor;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Laptop [model=" + Arrays.toString(model) + ", name=" + Arrays.toString(name) + ", processor="
			+ Arrays.toString(processor) + ", ram=" + ram + ", price=" + price + ", getModel()="
			+ Arrays.toString(getModel()) + ", getName()=" + Arrays.toString(getName()) + ", getProcessor()="
			+ Arrays.toString(getProcessor()) + ", getRam()=" + getRam() + ", getPrice()=" + getPrice()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



		
	}


