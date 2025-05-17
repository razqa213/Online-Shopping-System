import java.time.LocalDateTime;


abstract class product {

    private String name;
    private Double price;
    private int productId;
    protected  String category;
    // Menambahkan atribut createdAt 
    protected LocalDateTime createdAt; 

    // Membuat constructor product untuk set otomatis ketika objek dibuat
    

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

    public LocalDateTime getDateTime() {
        return createdAt;
    }

    public abstract String getCategory();

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
    
    public void setDate() {
        this.createdAt = LocalDateTime.now(); 
    }

    public void getInfo() {
        System.out.println(getName() + "-" + getPrice());
    }
}
