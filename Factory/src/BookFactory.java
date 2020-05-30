public class BookFactory {
    public Book makingbooks(String newBookType) {
        Book newBook = null;
        if (newBookType.equals("F")) {
            return new FictionBook();
        } else if (newBookType.equals("N")) {
            return new NovelBook();
        } else if (newBookType.equals("T")) {
            return new HorrorBook();
        } else
            return null;
    }
}