import java.util.HashMap;
import java.util.Map;

public class MarketData {
    private Map<String, Stock> stocks;

    public MarketData() {
        stocks = new HashMap<>();
        // Sample stocks
        stocks.put("AAPL", new Stock("AAPL", "Apple Inc.", 150.00));
        stocks.put("GOOGL", new Stock("GOOGL", "Alphabet Inc.", 2750.00));
        stocks.put("AMZN", new Stock("AMZN", "Amazon.com, Inc.", 3300.00));
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        Stock stock = stocks.get(symbol);
        if (stock != null) {
            stock.setPrice(newPrice);
        }
    }
}
