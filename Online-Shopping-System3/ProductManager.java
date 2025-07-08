import java.util.ArrayList;

public class ProductManager {
    private ArrayList<product2> products = new ArrayList<>();

    public void addProduct(product2 p) {
        for (product2 x : products) {
            if (x.getProductId() == p.getProductId()) return; // skip duplicates
        }
        products.add(p);
    }

    public ArrayList<product2> getAllProducts() {
        return products;
    }

    public product2 findProductById(int id) throws ProductNotFoundException {
        for (product2 x : products)
            if (x.getProductId() == id) return x;
        throw new ProductNotFoundException("Produk dengan ID " + id + " tidak ditemukan.");
    }
}
