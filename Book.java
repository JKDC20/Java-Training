import java.util.Scanner;

public class Book {
    Scanner input = new Scanner(System.in);
    String nameOfBook; 
    int numOfBook;

    public void read() {
        System.out.print("Enter book Name: ");
        nameOfBook = input.nextLine();
        System.out.println("The title of this book is: " + nameOfBook);
    }

    public void count() {
        System.out.print("Enter number of books: ");
        numOfBook = input.nextInt();
        System.out.println("The number of books is: " + numOfBook);
    }
    
    public static void main(String[] args) {
        Book b = new Book();
        b.read();   // nextLine is used
        b.count();  // nextInt is used
    }
}
