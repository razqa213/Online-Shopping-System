
public class Electronics2 extends product2 implements Discountable {
    private int warantyMonths;

    public Electronics2() {
        this.warantyMonths = 2;
    }

    public void setWarantyMonths(int warantyMonths) {
        this.warantyMonths = warantyMonths;
    }

    @Override
    public void getInfo() {
        System.out.println("Garansi: " + warantyMonths + " bulan");
    }

}
