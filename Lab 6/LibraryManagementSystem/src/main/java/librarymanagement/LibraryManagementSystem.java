package librarymanagement;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library myLibrary = new Library("City Library");

        LibraryBranch branch1 = new LibraryBranch("Downtown Branch");
        LibraryBranch branch2 = new LibraryBranch("Uptown Branch");

        myLibrary.addBranch(branch1);
        myLibrary.addBranch(branch2);

        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321");

        branch1.addBook(book1);
        branch1.addBook(book2);

        branch1.displayBooks();
        myLibrary.displayBranches();

        branch1.removeBook("123456789");
        branch1.displayBooks();

    }
}