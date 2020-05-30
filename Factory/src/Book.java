public abstract class Book {
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void printBookName(){
        System.out.println("El nombre del libro es: "+getName());
    }
    public void printBookAuthor(){
        System.out.println("El autor del libro es: "+getAuthor());
    }    
    public void printBookPrice(){
        System.out.println("El precio del libro es: "+getPrice());
    }
}