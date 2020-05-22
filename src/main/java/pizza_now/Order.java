package pizza_now;

public class Order {
	
	private int id;
	private int pizzaId;
	private String fullname;
	private String address;

	public Order(int id, int pizzaId, String fullname, String address) {
		this.id = id;
		this.pizzaId = pizzaId;
		this.fullname = fullname;
		this.address = address;
	}

	public String getPizzaName() {
		return Pizzas.get(pizzaId).getName();
	}

	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}
}
