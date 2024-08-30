public class App {
    public static void main(String[] args) throws Exception {
        TradingPlatform platform = new TradingPlatform(10000); // Starting with $10,000
                                                                                                       //stocks.put("AAPL", new Stock("AAPL", "Apple Inc.", 150.00));
                                                                                                      // stocks.put("GOOGL", new Stock("GOOGL", "Alphabet Inc.", 2750.00));
                                                                                                     // stocks.put("AMZN", new Stock("AMZN", "Amazon.com, Inc.", 3300.00));                 


        platform.executeOrder(new Order("AAPL", 10, Order.OrderType.BUY));              
        platform.executeOrder(new Order("GOOGL", 5, Order.OrderType.BUY));              
        platform.executeOrder(new Order("AAPL", 5, Order.OrderType.SELL));              

        platform.displayPortfolio();
    }
}
