public class mainapp2 {
    public static void main(String[] args) {
        Electronics2 elektronik = new Electronics2();
        Electronics2.Specification spek = elektronik.new Specification(2.0, "Hino");
        
        clothing2 baju = new clothing2();

        {// mengisi object elektronik
        elektronik.setName("Acer" );
        elektronik.setPrice(210.00);
        elektronik.setProductId(1);
        elektronik.setWarantyMonths(12);
        elektronik.setCategory("laptop");


        }

        {
        // mengisi object baju 
        baju.setName("Uniqlo");
        baju.setPrice(12.01);
        baju.setProductId(2);
        baju.setSize(Size.L);
        baju.setCategory("Baju");
        }

        System.out.println("=== LIST PRODUK ELEKTRONIK ===");
        System.out.println("Nama Produk : " + elektronik.getName() + "\nHarga Produk : " + elektronik.getDiscountedPrice(10.0) + " Euro" + "\nId : " + elektronik.getProductId() + "\nTanggal Pesan : " + elektronik.getFormattedDate() + "\ncategory : " + elektronik.getCategory());
        elektronik.getInfo();
        spek.getSpecs();

        System.out.println("\n=== LIST PRODUK PAKAIAN ===");
        System.out.println("Nama Produk : " + baju.getName() + "\nHarga Produk : " + baju.getPrice() + " Euro" + "\nId : " + baju.getProductId() + "\nPrice after 10% discount (Baju): $" + baju.getDiscountedPrice(10.0) + "\nTanggal Pesan : " + baju.getFormattedDate()+"\ncategory : " + baju.getCategory());
        baju.getInfo();

    }
    
}