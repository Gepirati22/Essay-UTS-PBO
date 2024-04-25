class SportsShoe extends Shoe {
    private String sportType;

    // Konstruktor
    public SportsShoe(String brand, double size, double price, String sportType) {
        super(brand, size, price);
        this.sportType = sportType;
    }

    @Override
    public String getInfo() {
        return "Brand: " + getBrand() + ", Size: " + getSize() + ", Price: Rp." + getPrice() + ", Sport Type: " + sportType;
    }
}