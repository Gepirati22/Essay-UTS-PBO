class FormalShoe extends Shoe {
    private String material;

    // Konstruktor
    public FormalShoe(String brand, double size, double price, String material) {
        super(brand, size, price);
        this.material = material;
    }

    @Override
    public String getInfo() {
        return "Brand: " + getBrand() + ", Size: " + getSize() + ", Price: Rp." + getPrice() + ", Material: " + material;
    }
}