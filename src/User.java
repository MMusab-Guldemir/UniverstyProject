public abstract class User {
    protected String name; //kullanicinin ismi
    protected String email; //kullanicinin emaili
    protected int ID; //kullanicinin ID numarasi

    // Constructor
    public User(String name, String email, int ID){
        this.name = name;
        this.email = email;
        this.ID = ID;
    }

    // Kullanicinin bilgilerini ekrana yazdiran metod
    // Eğer bu classi extend ediyorsan, bu metodu override etmelisin (kendin tekrar yazmalisin)
    public abstract void displayInfo();
}
