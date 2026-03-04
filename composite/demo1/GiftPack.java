package composite.demo1;

import java.util.ArrayList;
import java.util.List;

public class GiftPack implements Item {

	// private final List<Item> items = new ArrayList<Item>(); // Before Java 7
	private final List<Item> items = new ArrayList<>();

	// Flexibility: Add any Item (Pen, Pencil, or another GiftPack)
	public void add(Item item) {
		items.add(item);
	}

	// Remove an item, if needed
	public void remove(Item item) {
		items.remove(item);
	}

	@Override
	public double price() {
		double totalPrice = 0;
		for (Item item : items) {
			totalPrice += item.price();
		}
		return totalPrice;
	}
}
