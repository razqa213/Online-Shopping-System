public class mainapp {
    public static void main(String[] args) {
        Electronics laptop = new Electronics();
        clothing baju = new clothing();

        {// mengisi object laptop
        laptop.setName("Acer" );
        laptop.setPrice(210.52);
        laptop.setProductId(1);
        laptop.setWarantyMonths(12);
<<<<<<< HEAD

=======
>>>>>>> d6f66fdfa23a701e0d1117667ed9f2461a4e2be8
        }

        {
        // mengisi object baju 
        baju.setName("Uniqlo");
        baju.setPrice(12.01);
        baju.setProductId(2);
<<<<<<< HEAD
        baju.setSize("L");

        baju.setName("Levis");
        baju.setPrice(13.01);
        baju.setProductId(2);
        baju.setSize("L");

        baju.setName("Miniso");
        baju.setPrice(11.01);
        baju.setProductId(2);
        baju.setSize("L");
=======
>>>>>>> d6f66fdfa23a701e0d1117667ed9f2461a4e2be8
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