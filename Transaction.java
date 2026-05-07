public class Transaction {
    String type;
    String stockName;
    int quantity;
    double price;

    public Transaction(String type, String stockName, int quantity, double price) {
        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return type + " | " + stockName + " | Qty: " + quantity + " | Price: " + price;
    }
}