
import java.security.DrbgParameters;
import java.util.Scanner;


public class product {

    Scanner input = new Scanner(System.in);

    private String name;
    private Double price;
    private int productId;

    // Getter - mengambil/mengembalikan nilai
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    // Setter - memberikan nilai
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void getInfo() {
        System.out.println(getName() + "-" + getPrice());
    }
}
