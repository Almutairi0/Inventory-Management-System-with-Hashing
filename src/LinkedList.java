public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(Item item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    public Item search(String sku) {
        Node current = head;
        while (current != null) {
            if (current.item.getSKU().equals(sku)) {
                return current.item;
            }
            current = current.next;
        }
        return null;
    }

    public boolean delete(String sku) {
        if (head == null) return false;

        if (head.item.getSKU().equals(sku)) {
            head = head.next;
            return true;
        }

        Node current = head;
        Node previous = null;

        while (current != null && !current.item.getSKU().equals(sku)) {
            previous = current;
            current = current.next;
        }

        if (current == null) return false;

        previous.next = current.next;
        return true;
    }

    public void display() {
        Node current = head;
        System.out.print("Chain: ");
        while (current != null) {
            System.out.print("[" + current.item.getName() + " (" + current.item.getSKU() + ")] -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node getHead() {
        return head;
    }
}
