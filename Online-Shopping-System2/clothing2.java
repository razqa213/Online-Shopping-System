public class clothing2 extends product2 implements Discountable {
    private Size size;

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public void getInfo() {
        System.out.println("Size: " + size);
    }

    @Override
    public double getDiscountedPrice(double discountPercentage) {
        return getPrice() - (getPrice() * discountPercentage / 100);
    }
}
