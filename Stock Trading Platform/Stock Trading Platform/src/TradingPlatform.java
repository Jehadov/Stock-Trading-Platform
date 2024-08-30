public class TradingPlatform {
    private MarketData marketData;
    private Portfolio portfolio;

    public TradingPlatform(double initialBalance) {
        marketData = new MarketData();
        portfolio = new Portfolio(initialBalance);
    }

    public void executeOrder(Order order) {
        Stock stock = marketData.getStock(order.getSymbol());
        if (stock == null) {
            System.out.println("Stock " + order.getSymbol() + " not found.");
            return;
        }

        if (order.getType() == Order.OrderType.BUY) {
            portfolio.buyStock(stock, order.getQuantity());
        } else if (order.getType() == Order.OrderType.SELL) {
            portfolio.sellStock(stock, order.getQuantity());
        }
    }

    public void displayPortfolio() {
        portfolio.displayPortfolio();
    }
}
