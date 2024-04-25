public class App {
   
     public static void main(String[] args) {
        // Membuat objek OnlineShoeStore
        OnlineShoeStore store = new OnlineShoeStore();
    
        // Menambahkan sepatu 
        SportsShoe sportsShoe = new SportsShoe("Nike", 10.0, 1000000.00, "Running");
        SportsShoe sportsShoe1 = new SportsShoe("Adidas", 11.0, 1600000.00, "Running");
        FormalShoe formalShoe = new FormalShoe("Gucci", 9.0, 1500000.00, "Leather");
        store.addShoe(sportsShoe);
        store.addShoe(sportsShoe1);
        store.addShoe(formalShoe);
    
        // Menampilkan semua sepatu
        store.displayShoes();
    }
}
