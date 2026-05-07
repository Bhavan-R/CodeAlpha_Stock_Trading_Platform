import java.util.*;

public class User {
    private String name;
    private double balance = 0;

    private Map<String, Integer> portfolio = new HashMap<>();
    private Map<String, Double> buyPrice = new HashMap<>();
    private List<Transaction> history = new ArrayList<>();

    private double totalProfit = 0;

    public User(String name) {
        this.name = name;
    }

    // Add money
    public void addMoney(double amount) {
        balance += amount;
        System.out.println("Money added: Rs." + amount);
    }

    // Buy stock
    public void buyStock(Stock stock, int qty) {
        double cost = stock.getPrice() * qty;

        if (balance >= cost) {
            balance -= cost;

            portfolio.put(stock.getName(),
                    portfolio.getOrDefault(stock.getName(), 0) + qty);

            buyPrice.put(stock.getName(), stock.getPrice());

            history.add(new Transaction("BUY", stock.getName(), qty, stock.getPrice()));

            System.out.println("Bought " + qty + " " + stock.getName());
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Sell stock with Profit/Loss
    public void sellStock(Stock stock, int qty) {
        int owned = portfolio.getOrDefault(stock.getName(), 0);

        if (owned >= qty) {

            double buyP = buyPrice.getOrDefault(stock.getName(), 0.0);
            double sellP = stock.getPrice();

            double profitLoss = (sellP - buyP) * qty;

            portfolio.put(stock.getName(), owned - qty);

            balance += sellP * qty;

            totalProfit += profitLoss;

            history.add(new Transaction("SELL", stock.getName(), qty, sellP));

            if (profitLoss >= 0) {
                System.out.println("Profit: Rs." + profitLoss);
            } else {
                System.out.println("Loss: Rs." + profitLoss);
            }

        } else {
            System.out.println("Not enough stock");
        }
    }

    // Portfolio
    public void showPortfolio() {
        System.out.println("\nUSER: " + name);
        System.out.println("Balance: Rs." + balance);

        System.out.println("\nHoldings:");
        for (String key : portfolio.keySet()) {
            System.out.println(key + " : " + portfolio.get(key));
        }

        System.out.println("\nTotal Profit/Loss: Rs." + totalProfit);
    }

    // History
    public void showHistory() {
        System.out.println("\nTRANSACTION HISTORY:");
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}