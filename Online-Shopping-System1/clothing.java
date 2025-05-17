public class clothing extends productold {
    private String size;

    public clothing() {
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
