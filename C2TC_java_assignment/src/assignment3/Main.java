package assignment3;

public class Main {
    public static void main(String[] args) {
        // Part A – Inheritance
        Book book1 = new Book(1, "Java Programming", "James Gosling");
        Magazine mag1 = new Magazine(2, "Tech Today", 45);

        System.out.println("=== Part A: Inheritance ===");
        book1.displayInfo();
        System.out.println("-------------------");
        mag1.displayInfo();

        // Part B – Composition
        Library library = new Library();
        library.addItem(book1);
        library.addItem(mag1);

        System.out.println("\n=== Part B: Composition ===");
        library.showAllItems();
    }
}