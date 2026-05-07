import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Market market = new Market();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        User user = new User(name);

        while (true) {

            System.out.println("\n===== STOCK TRADING SYSTEM =====\n");
            System.out.println("1. Add Money");
            System.out.println("2. View Market");
            System.out.println("3. Buy Stock");
            System.out.println("4. Sell Stock");
            System.out.println("5. Portfolio");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit\n");

            System.out.print("\nChoose: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    user.addMoney(amt);
                    break;

                case 2:
                    market.updatePrices();
                    market.showStocks();
                    break;

                case 3:
                    System.out.print("Stock name: ");
                    String bname = sc.next();
                    System.out.print("Qty: ");
                    int bqty = sc.nextInt();

                    Stock bs = market.getStock(bname);
                    if (bs != null) user.buyStock(bs, bqty);
                    else System.out.println("Stock not found");
                    break;

                case 4:
                    System.out.print("Stock name: ");
                    String sname = sc.next();
                    System.out.print("Qty: ");
                    int sqty = sc.nextInt();

                    Stock ss = market.getStock(sname);
                    if (ss != null) user.sellStock(ss, sqty);
                    else System.out.println("Stock not found");
                    break;

                case 5:
                    user.showPortfolio();
                    break;

                case 6:
                    user.showHistory();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}