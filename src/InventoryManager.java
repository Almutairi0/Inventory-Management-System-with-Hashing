import java.util.List;
import java.util.Scanner;

public class InventoryManager {

	private HashTable table;
	private SortingSearching sortingSearching;
	private Scanner scanner;

	public InventoryManager() {
		table = new HashTable(10);
		sortingSearching = new SortingSearching(table);
		scanner = new Scanner(System.in);
	}

	public void addItem() {
		System.out.print("Enter SKU: ");
		String sku = scanner.nextLine();

		System.out.print("Enter Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Category: ");
		String category = scanner.nextLine();

		System.out.print("Enter Price: ");
		double price = scanner.nextDouble();

		System.out.print("Enter Quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		Item item = new Item(sku, name, category, price, quantity);
		table.insert(item);

		System.out.println("Item added successfully.\n");
	}

	public void updateItem() {
		System.out.print("Enter SKU to update: ");
		String sku = scanner.nextLine();

		Item existing = table.search(sku);
		if (existing == null) {
			System.out.println("Item not found.\n");
			return;
		}

		System.out.print("Enter new price: ");
		double price = scanner.nextDouble();

		System.out.print("Enter new quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();

		Item newItem = new Item(sku, existing.getName(),
				existing.getCategory(), price, quantity);

		table.update(newItem);
		System.out.println("Item updated successfully.\n");
	}

	public void deleteItem() {
		System.out.print("Enter SKU to delete: ");
		String sku = scanner.nextLine();

		boolean deleted = table.delete(sku);
		if (deleted)
			System.out.println("Item deleted successfully.\n");
		else
			System.out.println("Item not found.\n");
	}

	public void searchMenu() {
		System.out.println("1. Search by Name");
		System.out.println("2. Search by Category");
		System.out.print("Choose option: ");

		int choice = scanner.nextInt();
		scanner.nextLine();

		if (choice == 1) {
			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			displayItems(sortingSearching.searchByName(name));
		} else if (choice == 2) {
			System.out.print("Enter category: ");
			String category = scanner.nextLine();
			displayItems(sortingSearching.searchByCategory(category));
		}
	}

	public void sortMenu() {
		System.out.println("1. Sort by Price");
		System.out.println("2. Sort by Quantity");
		System.out.print("Choose option: ");

		int choice = scanner.nextInt();
		scanner.nextLine();

		if (choice == 1) {
			displayItems(sortingSearching.sortByPrice());
		} else {
			displayItems(sortingSearching.sortByQuantity());
		}
	}

	public void run() {
		int choice;

		do {
			System.out.println("===== Inventory Management System =====");
			System.out.println("1. Add Item");
			System.out.println("2. Update Item");
			System.out.println("3. Delete Item");
			System.out.println("4. Search Item");
			System.out.println("5. Sort Items");
			System.out.println("6. Display All");
			System.out.println("0. Exit");
			System.out.print("Choose option: ");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1 -> addItem();
				case 2 -> updateItem();
				case 3 -> deleteItem();
				case 4 -> searchMenu();
				case 5 -> sortMenu();
				case 6 -> table.displayAll();
				case 0 -> System.out.println("Goodbye!");
				default -> System.out.println("Invalid choice.\n");
			}

		} while (choice != 0);
	}

	private void displayItems(List<Item> items) {
		if (items.isEmpty()) {
			System.out.println("No items found.\n");
			return;
		}

		for (Item item : items) {
			System.out.println(
					item.getSKU() + " | " +
							item.getName() + " | " +
							item.getCategory() + " | " +
							item.getPrice() + " | " +
							item.getQuantity());
		}
		System.out.println();
	}
}
