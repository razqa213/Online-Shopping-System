public class mainapp2 {
    public static void main(String[] args) {
        Electronics2 elektronik = new Electronics2();
        Electronics2.Specification spek = elektronik.new Specification(2.0, "Hino");
        clothing2 pakaian = new clothing2();


        {// mengisi object elektronik
        elektronik.setName("Acer" );
        elektronik.setPrice(210.00);
        elektronik.setProductId(1);
        elektronik.setWarantyMonths(12);
        elektronik.setCategory("laptop");
        }

        {
        // mengisi object pakaian 
        pakaian.setName("Uniqlo");
        pakaian.setPrice(12.01);
        pakaian.setProductId(2);
        pakaian.setSize(Size.M);
        pakaian.setCategory("celana levis");
        }

        System.out.println("");

        System.out.println("=== LIST PRODUK ELEKTRONIK ===");
        System.out.println("Nama Produk : " + elektronik.getName() + "\nHarga Produk : " + elektronik.getDiscountedPrice(10.0) + " Euro" + "\nId : " + elektronik.getProductId() + "\nTanggal Pesan : " + elektronik.getDateTime() + "\nKategori : " + elektronik.getCategory());
        elektronik.getInfo();
        
        spek.getSpecs();
        System.out.println("");


    }
    
}