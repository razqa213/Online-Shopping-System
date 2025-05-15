public class mainapp {
    public static void main(String[] args) {
        Electronics laptop = new Electronics();
        clothing sempak = new clothing();

        {// mengisi object laptop
        laptop.setName("Acer" );
        laptop.setPrice(210.52);
        laptop.setProductId(1);
        laptop.setWarantyMonths(12);

        laptop.setName("Lenovo");
        laptop.setPrice(310.52);
        laptop.setProductId(1);
        laptop.setWarantyMonths(12);

        laptop.setName("ASUS");
        laptop.setPrice(320.52);
        laptop.setProductId(1);
        laptop.setWarantyMonths(12);
        }

        {
        // mengisi object sempak 
        sempak.setName("Uniqlo");
        sempak.setPrice(12.01);
        sempak.setProductId(2);
        sempak.setSize("L");

        sempak.setName("Levis");
        sempak.setPrice(13.01);
        sempak.setProductId(2);
        sempak.setSize("L");

        sempak.setName("Miniso");
        sempak.setPrice(11.01);
        sempak.setProductId(2);
        sempak.setSize("L");
        }

        System.out.println("");

        System.out.println("=== LIST PRODUK ELEKTRONIK ===");
        System.out.println("Nama Produk : " + laptop.getName() + "\nHarga Produk : " + laptop.getPrice() + " Euro" + "\nId : " + laptop.getProductId());
        laptop.getInfo();

        System.out.println("");

        System.out.println("=== LIST PRODUK PAKAIAN ===");
        System.out.println("Nama Produk : " + sempak.getName() + "\nHarga Produk : " + sempak.getPrice() + " Euro" + "\nId : " + sempak.getProductId());
        sempak.getInfo();

    }
    
}