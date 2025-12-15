public class HashTable {
	private LinkedList[] buckets;
	private int size;

	public HashTable(int size) {
		this.size = size;
		buckets = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			buckets[i] = new LinkedList();
		}
	}

	public int hash(String sku) {
		int hashValue = sku.hashCode();
		hashValue = Math.abs(hashValue);
		return hashValue % size;
	}

	public void insert(Item item) {
		int position = hash(item.getSKU());
		buckets[position].insert(item);
	}

	public boolean delete(String sku) {
		int position = hash(sku);
		return buckets[position].delete(sku);
	}

	public Item search(String sku) {
		int position = hash(sku);
		return buckets[position].search(sku);
	}

	public void update(Item newItem) {
		int position = hash(newItem.getSKU());

		Item existing = buckets[position].search(newItem.getSKU());

		if (existing != null) {
			existing.setPrice(newItem.getPrice());
			existing.setQuantity(newItem.getQuantity());
		}
	}

	public void displayAll() {
		for (int i = 0; i < size; i++) {
			System.out.print("Bucket " + i + ": ");
			buckets[i].display();
		}
	}

	public int getSize() {
		return size;
	}

	public LinkedList getBucket(int index) {
		return buckets[index];
	}

}
