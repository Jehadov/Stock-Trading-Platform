public class Order {
    public enum OrderType { BUY, SELL }

    private String symbol;
    private int quantity;
    private OrderType type;

    public Order(String symbol, int quantity, OrderType type) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.type = type;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderType getType() {
        return type;
    }

    @Override
    public String toString() {
        return (type == OrderType.BUY ? "Buy" : "Sell") + " " + quantity + " shares of " + symbol;
    }
}
