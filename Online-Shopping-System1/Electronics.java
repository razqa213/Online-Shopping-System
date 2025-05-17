public class Electronics extends productold {
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
