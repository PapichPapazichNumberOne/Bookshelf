/**
 * Класс, представляющий информацию о книгах.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String binding;

    /**
     * Создает новый объект Book.
     *
     * @param id         Идентификатор книги.
     * @param title      Название книги.
     * @param author     Автор(ы) книги.
     * @param publisher  Издательство.
     * @param year       Год издания.
     * @param pageCount  Количество страниц.
     * @param price      Цена.
     * @param binding    Тип переплета.
     */
    public Book(int id, String title, String author, String publisher, int year, int pageCount, double price, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.binding = binding;
    }

    /**
     * Получить идентификатор книги.
     *
     * @return Идентификатор книги.
     */
    public int getId() {
        return id;
    }

    /**
     * Получить название книги.
     *
     * @return Название книги.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Получить автора(ов) книги.
     *
     * @return Автор(ы) книги.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Получить издательство книги.
     *
     * @return Издательство книги.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Получить год издания книги.
     *
     * @return Год издания книги.
     */
    public int getYear() {
        return year;
    }

    /**
     * Получить количество страниц в книге.
     *
     * @return Количество страниц.
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Получить цену книги.
     *
     * @return Цена книги.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Получить тип переплета книги.
     *
     * @return Тип переплета.
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Переопределенный метод для представления объекта в виде строки.
     *
     * @return Строковое представление объекта Book.
     */
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}
