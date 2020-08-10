package polymophism;

public class Fruit {
	String name;
	int price;
	int fresh;
	
	
	public Fruit(String name, int price, int fresh) {
		super();
		this.name = name;
		this.price = price;
		this.fresh = fresh;
	}
	
	void print() {
		System.out.println(name + " : " + price + " : " + fresh);
	}
}
