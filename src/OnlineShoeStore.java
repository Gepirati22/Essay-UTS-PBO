import java.util.ArrayList;

class OnlineShoeStore {
    private ArrayList<Shoe> shoes;

    // Konstruktor
    public OnlineShoeStore() {
        shoes = new ArrayList<>();
    }

    // Menambahkan sepatu
    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }

    // Menampilkan semua sepatu yang ada di toko sepatu online
    public void displayShoes() {
        System.out.println("Shoes available in the store:");
        for (Shoe shoe : shoes) {
            System.out.println(shoe.getInfo());
        }
    }
}

