public class Game {

    private int gameID;
    private String title;
    private String genre;
    private double price;


    //Mine konstruktører:
    public Game(int gameID, String title, String genre, double price) {
    this.gameID = gameID;
    this.title = title;
    this.genre = genre;
    this.price = price;

    }

    //Mine getters:
    public int gameID() {
        return gameID;
    }
    public String title() {
        return title;
    }
    public String genre() {
        return genre;
    }
    public double price() {
        return price;
    }

    //Mine setters:
    public void setGameID(int gameID) {
        this.gameID = gameID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPrice(double price) {

    }

    public void displayDetails(){
        System.out.println("---------------------");
        System.out.println("Spil ID: " + gameID);
        System.out.println("Titel: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }

}
