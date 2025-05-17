public class clothing extends product implements Discountable {
    private Size size;

    public clothing(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String getCategory() {
        return this.category;
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
