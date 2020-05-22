package pizza_now;

public class Order {

	
	private int id;
	private String pizza;
	private String fullname;
	private String address;

	public Order(int id, String pizza, String fullname, String address) {
		this.id = id;
		this.pizza = pizza;
		this.fullname = fullname;
		this.address = address;
	}

	public String getPizza() {
		return Pizzas.get(Integer.parseInt(pizza)).getName();
	}

	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}
}
