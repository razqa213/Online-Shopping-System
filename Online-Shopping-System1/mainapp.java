public class mainapp {
    public static void main(String[] args) {
        Electronics laptop = new Electronics();
        clothing baju = new clothing();

        {// mengisi object laptop
        laptop.setName("Acer" );
        laptop.setPrice(210.52);
        laptop.setProductId(1);
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
        System.out.println("Nama Produk : " + laptop.getName() + "\nHarga Produk : " + laptop.getPrice() + " Euro" + "\nId : " + laptop.getProductId());
        laptop.getInfo();

        System.out.println("");

        System.out.println("=== LIST PRODUK PAKAIAN ===");
        System.out.println("Nama Produk : " + baju.getName() + "\nHarga Produk : " + baju.getPrice() + " Euro" + "\nId : " + baju.getProductId());
        baju.getInfo();

    }
    
}