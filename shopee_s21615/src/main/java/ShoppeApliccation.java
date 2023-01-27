import ch.qos.logback.core.net.server.Client;

public class ShoppeApliccation {
    public static void main(String[] args) {
    Client client = new Client() {
        @Override
        public void run() {

        }

        @Override
        public void close() {

        }
    };
    Storage storage = new Storage();
    Shopping shopping = new Shopping(client, storage);

    shopping.addItem("mleko");
    shopping.addItem("chleb");
    shopping.addItem("piwo");
    shopping.addItem("ser");

    shopping.finalizePurchase();
    }
}




