
public class Human implements Valuable {
	int age;
	String name;
	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public double EstimateValue(int month) {
		return Double.POSITIVE_INFINITY;
	}
}
