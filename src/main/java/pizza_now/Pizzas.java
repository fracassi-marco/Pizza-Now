package pizza_now;

import java.util.ArrayList;
import java.util.List;

public class Pizzas {
	public static List<Pizza> all() {
		List<Pizza> pizzas = new ArrayList<>();
		pizzas.add(new Pizza(1, "Margherita"));
		pizzas.add(new Pizza(2, "Marinara"));
		pizzas.add(new Pizza(3, "Tonno e cipolla"));
		
		return pizzas;
	}

	public static Pizza get(int id) {
		return all().stream().filter(it -> it.getId() == id).findFirst().get();
	}
}
