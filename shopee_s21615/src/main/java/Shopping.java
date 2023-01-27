import ch.qos.logback.core.net.server.Client;

import java.util.Scanner;

public class Shopping {
    public Shopping(Client client, Storage storage) {
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje saldo: ");
        float balance = scanner.nextFloat();
        Customer customer = new Customer(balance);

        Storage storage = new Storage();

        while (true) {
            System.out.print("Podaj nazwę produktu lub wpisz 'koniec' aby zakończyć zakupy: ");
            String productName = scanner.next();
            if (productName.equals("koniec")) {
                break;
            }
            Product product = storage.getProduct(productName);
            if (product != null) {
                storage.addProduct(product);
            } else {
                System.out.println("Nie ma takiego produktu");
            }

        }

        float totalCost = customer.getTotalCostOfBasket();
        System.out.println("Całkowity koszt twoich zakupów: " + totalCost + "zł");

        if (customer.canAfford(totalCost)) {
            customer.pay(totalCost);
            System.out.println("Zakupy zakończone pomyślnie, pozostałe saldo: " + customer.getBalance() + "zł");
        } else {
            System.out.println("Niestety nie masz wystarczającej ilości środków na koncie");
        }
    }

    public void addItem(String mleko) {
    }

    public void finalizePurchase() {
    }
}