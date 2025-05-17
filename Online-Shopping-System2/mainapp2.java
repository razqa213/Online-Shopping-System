public class mainapp2 {
    public static void main(String[] args) {
        Electronics2 laptop = new Electronics2();
        clothing2 baju = new clothing2();

        {// mengisi object laptop
        laptop.setName("Acer" );
        laptop.setPrice(210.52);
        laptop.setProductId(1);
        laptop.setDate();
        laptop.setWarantyMonths(12);
        

        }

        {
        // mengisi object baju 
        baju.setName("Uniqlo");
        baju.setPrice(12.01);
        baju.setProductId(2);
        }

        System.out.println("");

        System.out.println("=== LIST PRODUK ELEKTRONIK ===");
        System.out.println("Nama Produk : " + laptop.getName() + "\nHarga Produk : " + laptop.getPrice() + " Euro" + "\nId : " + laptop.getProductId() + "\nTanggal Pesan : " + laptop.getDateTime());
        laptop.getInfo();

        System.out.println("");

        System.out.println("=== LIST PRODUK PAKAIAN ===");
        System.out.println("Nama Produk : " + baju.getName() + "\nHarga Produk : " + baju.getPrice() + " Euro" + "\nId : " + baju.getProductId() + "\nPrice after 10% discount (Laptop): $" + baju.getDiscountedPrice(10.0));
        baju.getInfo();

    }
    
}