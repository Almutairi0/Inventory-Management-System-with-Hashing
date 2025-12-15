public class Main {
	public static void main(String[] args) {

		HashTable table = new HashTable(10);

		table.insert(new Item("SKU001", "Laptop", "Electronics", 4500.0, 5));
		table.insert(new Item("SKU002", "Phone", "Electronics", 3200.0, 10));
		table.insert(new Item("SKU003", "Chair", "Furniture", 250.0, 20));
		table.insert(new Item("SKU004", "Desk", "Furniture", 800.0, 7));
		table.insert(new Item("SKU005", "Headphones", "Electronics", 600.0, 15));

		System.out.println("=== Hash Table Contents ===");
		table.displayAll();

		System.out.println("\n=== Search by SKU ===");
		Item found = table.search("SKU002");
		if (found != null) {
			System.out.println("Found: " + found.getName() + " - " + found.getPrice());
		} else {
			System.out.println("Item not found");
		}

		System.out.println("\n=== Update Item ===");
		table.update(new Item("SKU002", "Phone", "Electronics", 3000.0, 12));
		Item updated = table.search("SKU002");
		System.out.println("Updated Price: " + updated.getPrice());
		System.out.println("Updated Quantity: " + updated.getQuantity());

		System.out.println("\n=== Delete Item ===");
		boolean deleted = table.delete("SKU003");
		System.out.println("Item deleted: " + deleted);

		System.out.println("\n=== Hash Table After Deletion ===");
		table.displayAll();

		SortingSearching ss = new SortingSearching(table);

		System.out.println("\n=== Sort by Price ===");
		for (Item item : ss.sortByPrice()) {
			System.out.println(item.getName() + " - " + item.getPrice());
		}

		System.out.println("\n=== Sort by Quantity ===");
		for (Item item : ss.sortByQuantity()) {
			System.out.println(item.getName() + " - " + item.getQuantity());
		}

		System.out.println("\n=== Search by Category: Electronics ===");
		for (Item item : ss.searchByCategory("Electronics")) {
			System.out.println(item.getName());
		}

		System.out.println("\n=== Search by Name: Desk ===");
		for (Item item : ss.searchByName("Desk")) {
			System.out.println(item.getName() + " - " + item.getPrice());
		}
	}
}
