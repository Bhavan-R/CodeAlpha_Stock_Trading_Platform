import java.util.*;

public class Market {
    private List<Stock> stocks = new ArrayList<>();

    public Market() {
        stocks.add(new Stock("TCS", 3500));
        stocks.add(new Stock("INFY", 1500));
        stocks.add(new Stock("WIPRO", 450));
        stocks.add(new Stock("HDFC", 1600));
    }

    public void showStocks() {
        System.out.println("\nMARKET DATA:");
        for (Stock s : stocks) {
            System.out.println(s.getName() + " - Rs." + s.getPrice());
        }
    }

    public Stock getStock(String name) {
        for (Stock s : stocks) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // simulate market movement
    public void updatePrices() {
        for (Stock s : stocks) {
            double change = (Math.random() * 100) - 50;
            s.setPrice(Math.max(100, s.getPrice() + change));
        }
    }
}