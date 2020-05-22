package pizza_now;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Orders {

	private static List<Order> orders = new ArrayList<>();

	public static void add(String pizza, String fullname, String address) {
		orders.add(new Order(new Random().nextInt(), Integer.parseInt(pizza), fullname, address));
	}

	public static List<Order> all() {
		return orders.stream().sorted(Comparator.comparing(Order::getFullname)).collect(Collectors.toList());
	}

	public static void delete(String id) {
		orders.removeIf(it -> it.getId() == Integer.parseInt(id));
	}

}
