abstract class Shoe {
    private String brand;
    private double size;
    private double price;

    // Konstruktor
    public Shoe(String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // Metode abstrak untuk mendapatkan informasi sepatu
    public abstract String getInfo();

    // Getter untuk merek sepatu
    public String getBrand() {
        return brand;
    }

    // ukuran sepatu
    public double getSize() {
        return size;
    }

    // harga sepatu
    public double getPrice() {
        return price;
    }
}