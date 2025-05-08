public class Clothing extends product {
    private String size;

    public Clothing() {
        this.size = "Large";
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void getInfo() {
        System.out.println("size: " + size);
    }
}
