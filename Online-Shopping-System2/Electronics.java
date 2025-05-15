public class Electronics extends product {
    private int warantyMonths;

    public Electronics() {
        this.warantyMonths = 1;
    }

    public void setWarantyMonths(int warantyMonths) {
        this.warantyMonths = warantyMonths;
    }

    @Override
    public void getInfo() {
        System.out.println("Garansi: " + warantyMonths + " bulan");
    }
}
