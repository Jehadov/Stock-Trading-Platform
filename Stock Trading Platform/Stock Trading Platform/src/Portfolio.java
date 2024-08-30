
import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Integer> holdings;
    private double balance;

    public Portfolio(double initialBalance) {
        holdings = new HashMap<>();
        this.balance = initialBalance;
    }

    public void buyStock(Stock stock, int quantity) {
        double cost = stock.getPrice() * quantity;
        if (balance >= cost) {
            holdings.put(stock.getSymbol(), holdings.getOrDefault(stock.getSymbol(), 0) + quantity);
            balance -= cost;
        } else {
            System.out.println("Insufficient funds to buy " + quantity + " shares of " + stock.getSymbol());
        }
    }

    public void sellStock(Stock stock, int quantity) {
        int currentHolding = holdings.getOrDefault(stock.getSymbol(), 0);
        if (currentHolding >= quantity) {
            holdings.put(stock.getSymbol(), currentHolding - quantity);
            balance += stock.getPrice() * quantity;
        } else {
            System.out.println("Not enough shares to sell");
        }
    }

    public void displayPortfolio() {
        System.out.println("Portfolio:");
        for (Map.Entry<String, Integer> entry : holdings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " shares");
        }
        System.out.println("Cash balance: $" + balance);
    }
}
