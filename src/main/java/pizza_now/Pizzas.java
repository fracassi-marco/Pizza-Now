package pizza_now;

import java.util.HashMap;
import java.util.Map;

public class Pizzas {
	public static Map<Integer, String> all() {
		Map <Integer, String> pizzas = new HashMap<>();
		pizzas.put(1, "Margherita");
		pizzas.put(2, "Marinara");
		pizzas.put(3, "Tonno e cipolla");
		
		return pizzas;
	}
}
