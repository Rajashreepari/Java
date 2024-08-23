import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int numCopies;

    public Book(String title, String author, double price, int numCopies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numCopies = numCopies;
    }

    public static Book getBookDetails(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter number of copies: ");
        int numCopies = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        return new Book(title, author, price, numCopies);
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book Price: " + this.price);
        System.out.println("Number of Copies: " + this.numCopies);
        System.out.println();
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = Book.getBookDetails(scanner);
            System.out.println();
        }

        System.out.println("Books in the inventory:");
        for (Book book : books) {
            book.displayBookDetails();
        }

        scanner.close();
    }
}