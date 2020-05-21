package pizza_now;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Orders {
	
	private static List<Order> orders = new ArrayList<>();

	public static void add(String pizza, String fullname, String address) {
		orders.add(new Order(new Random().nextInt(), pizza, fullname, address));
	}

}
