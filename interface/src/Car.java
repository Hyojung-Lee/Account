
public class Car implements Valuable {
	String name;
	double price;
	public Car(String name, double price){
		this.name=name;
		this.price=price;
	}
	@Override
	public double EstimateValue(int month) {
		price=price*(8/10)*Math.pow(0.99,month);
		return price;
	}
	public String toString(){
		return String.format("");
	}
}
