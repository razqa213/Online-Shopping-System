public class Electronics2 extends product2 implements Discountable {
    private int warantyMonths;
    private double price;

    public Electronics2() {
        this.warantyMonths = 1;
        this.price = 0.0;
    }

    public void setWarantyMonths(int warantyMonths) {
        this.warantyMonths = warantyMonths;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getCategory() {
        return this.category;

    }
    // Implementasi interface Discountable
    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }

    @Override
    public void getInfo() {
        System.out.println("Garansi: " + warantyMonths + " bulan");
    }

    // Inner class Specification
    public class Specification {
        private double weight;
        private String brand;

        public Specification(double weight, String brand) {
            this.weight = weight;
            this.brand = brand;
            
        }

        public void getSpecs() {
            System.out.println("Spesifikasi - Berat: " + weight + " kg, Merek: " + brand); 
        }
    }
}