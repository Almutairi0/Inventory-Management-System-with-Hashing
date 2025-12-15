import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingSearching {

	private HashTable table;

	public SortingSearching(HashTable table) {
		this.table = table;
	}

	private List<Item> getAllItems() {
		List<Item> items = new ArrayList<>();

		for (int i = 0; i < table.getSize(); i++) {
			Node current = table.getBucket(i).getHead();

			while (current != null) {
				items.add(current.item);
				current = current.next;
			}
		}
		return items;
	}

	public List<Item> sortByPrice() {
		List<Item> items = getAllItems();

		Collections.sort(items, Comparator.comparingDouble(Item::getPrice));
		return items;
	}

	public List<Item> sortByQuantity() {
		List<Item> items = getAllItems();

		Collections.sort(items, Comparator.comparingInt(Item::getQuantity));
		return items;
	}

	public List<Item> searchByName(String name) {
		List<Item> result = new ArrayList<>();

		for (Item item : getAllItems()) {
			if (item.getName().equalsIgnoreCase(name)) {
				result.add(item);
			}
		}
		return result;
	}

	public List<Item> searchByCategory(String category) {
		List<Item> result = new ArrayList<>();

		for (Item item : getAllItems()) {
			if (item.getCategory().equalsIgnoreCase(category)) {
				result.add(item);
			}
		}
		return result;
	}
}
