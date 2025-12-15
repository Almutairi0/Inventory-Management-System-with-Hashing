+--------------------------------------+
|                Item                  |
+--------------------------------------+
| - sku: String                        |
| - name: String                       |
| - category: String                   |
| - price: double                      |
| - quantity: int                      |
+--------------------------------------+
| + getSKU(): String                   |
| + getName(): String                  |
| + getCategory(): String              |
| + getPrice(): double                 |
| + getQuantity(): int                 |
| + setPrice(price: double): void      |
| + setQuantity(qty: int): void        |
+--------------------------------------+

                 1
                 |
                 |
                 * (many)
+--------------------------------------+
|              Node                    |
+--------------------------------------+
| - item: Item                         |
| - next: Node                         |
+--------------------------------------+
| + Node(item: Item)                   |
+--------------------------------------+

                 1
                 |
                 |
                 *
+--------------------------------------+
|           LinkedList                 |
+--------------------------------------+
| - head: Node                         |
+--------------------------------------+
| + insert(item: Item): void           |
| + delete(sku: String): boolean       |
| + search(sku: String): Item          |
| + display(): void                    |
+--------------------------------------+

                 1
                 |
                 |
                 *
+--------------------------------------+
|             HashTable                |
+--------------------------------------+
| - buckets: LinkedList[]              |
| - size: int                          |
+--------------------------------------+
| + hash(sku: String): int             |
| + insert(item: Item): void           |
| + delete(sku: String): boolean       |
| + update(item: Item): void           |
| + search(sku: String): Item          |
| + displayAll(): void                 |
+--------------------------------------+

+--------------------------------------+
|         SortingSearching             |
+--------------------------------------+
| + sortByPrice(): List<Item>          |
| + sortByQuantity(): List<Item>       |
| + searchByName(name:String): List    |
| + searchByCategory(cat:String): List |
+--------------------------------------+

                 uses
InventoryManager ----------------------> HashTable
                 uses
InventoryManager ----------------------> SortingSearching

+--------------------------------------+
|         InventoryManager             |
+--------------------------------------+
| + addItem(): void                    |
| + updateItem(): void                 |
| + deleteItem(): void                 |
| + searchMenu(): void                 |
| + sortMenu(): void                   |
| + run(): void                        |
+--------------------------------------+
