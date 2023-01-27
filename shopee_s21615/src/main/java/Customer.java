public class Customer {
    private float balance;
    private Cart cart;

    public Customer(float balance) {
        this.balance = balance;
        this.cart = new Cart();
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    public boolean pay(float totalCost) {
        if (balance >= cart.getTotalPrice()) {
            balance -= cart.getTotalPrice();
            return true;
        }
        return false;
    }

    public void addProductToBasket(Product product) {
    }

    public float getTotalCostOfBasket() {
        return 0;
    }

    public boolean canAfford(float totalCost) {

        return false;
    }

    public String getBalance() {

        return null;
    }
}

