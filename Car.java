
public class Car {
	String brand;
	String model;
	String name;
	float price;
	public Car(String brand1, String model1, String name1, float price1) {
		super();
		this.brand = brand1;
		this.model = model1;
		this.name = name;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
	}
		public String toString() {
			return "Car [brand=" + brand + ", model=" + model + ", name=" + name + ", price=" + price + ", getBrand()="
					+ getBrand() + ", getModel()=" + getModel() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
	}

}

    