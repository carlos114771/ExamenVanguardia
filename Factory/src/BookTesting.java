import java.util.Scanner;

public class BookTesting {
    
    public static void main(String[] args){
        Book newBook=null;
        BookFactory bookfactory =  new BookFactory();
        Scanner userInput = new Scanner(System.in);
    
        System.out.println("Eliga el tipo de libro\n"+"\nF: Ficcion"+"\nN: Novela "+ "\nT: Terror");
        if(userInput.hasNextLine()){
            String typeofBook = userInput.nextLine();
            newBook=  bookfactory.makingbooks(typeofBook);
            
        }
        if (newBook!=null){
            printBook(newBook);
        }else System.out.println("Ingresar F, T, o N");
    }


    public static void printBook(Book printbook){
        printbook.printBookName();
        printbook.printBookAuthor();
        printbook.printBookPrice();
    }
}