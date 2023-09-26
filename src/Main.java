import java.util.ArrayList;
import java.util.List;
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Book 1", "Author 1", "Publisher A", 2000, 300, 25.99, "Hardcover"),
                new Book(2, "Book 2", "Author 2", "Publisher B", 2010, 400, 19.99, "Paperback"),
                new Book(3, "Book 3", "Author 1", "Publisher A", 2021, 250, 30.50, "Hardcover"),
                new Book(4, "Book 4", "Author 3", "Publisher C", 2015, 350, 14.95, "Paperback")
        };

        // a) Вывод списка книг заданного автора
        String authorToFind = "Author 1";
        List<Book> booksByAuthor = findBooksByAuthor(books, authorToFind);
        System.out.println("Книги автора " + authorToFind + ":");
        printBooks(booksByAuthor);

        // b) Вывод списка книг, выпущенных заданным издательством
        String publisherToFind = "Publisher A";
        List<Book> booksByPublisher = findBooksByPublisher(books, publisherToFind);
        System.out.println("\nКниги издательства " + publisherToFind + ":");
        printBooks(booksByPublisher);

        // c) Вывод списка книг, выпущенных после заданного года
        int yearToFind = 2010;
        List<Book> booksAfterYear = findBooksPublishedAfterYear(books, yearToFind);
        System.out.println("\nКниги, выпущенные после " + yearToFind + " года:");
        printBooks(booksAfterYear);
    }

    /**
     * Метод для поиска книг по автору.
     *
     * @param books  Массив объектов Book.
     * @param author Автор для поиска.
     * @return Список книг, написанных заданным автором.
     */
    private static List<Book> findBooksByAuthor(Book[] books, String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Метод для поиска книг по издательству.
     *
     * @param books     Массив объектов Book.
     * @param publisher Издательство для поиска.
     * @return Список книг, выпущенных заданным издательством.
     */
    private static List<Book> findBooksByPublisher(Book[] books, String publisher) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Метод для поиска книг, выпущенных после заданного года.
     *
     * @param books Массив объектов Book.
     * @param year  Год для поиска.
     * @return Список книг, выпущенных после заданного года.
     */
    private static List<Book> findBooksPublishedAfterYear(Book[] books, int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Метод для вывода списка книг на консоль.
     *
     * @param books Список книг для вывода.
     */
    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}