public class mainapp {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 999.99, 1001, 24);
        Clothing tshirt = new Clothing("T-Shirt", 19.99, 2001, "M");

        System.out.println("Product Information:");
        System.out.println(laptop.getInfo());
        System.out.println(tshirt.getInfo());
    }
}
