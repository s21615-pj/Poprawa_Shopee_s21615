import java.util.ArrayList;

public class Storage {
    private ArrayList<Product> products;

    public Storage() {
        products = new ArrayList<Product>();
        products.add(new Product("mleko", 3));
        products.add(new Product("kasza", 2));
        products.add(new Product("chleb", 4));
        products.add(new Product("piwo", 3.5f));
        products.add(new Product("mąka", 4));
        products.add(new Product("bułki", 1));
        products.add(new Product("ser", 7));
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public void addProduct(Product product) {
        float totalCost = product.getPrice();
    }

    public float getTotalCost() {
        float totalCost = 0;
        return totalCost;
    }
}


