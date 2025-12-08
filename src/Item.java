public class Item {
    private String  sku, name, category;
    private double price;
    private int quantity;

    public Item(String sku, String name, String category, double price, int quantity) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSKU() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int qty) {
        this.quantity = qty;
    }



}
