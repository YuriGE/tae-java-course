

package homework7;

public class Book {

    private String title, author;
    private int year;

    public Book(String title) {

        this(title, "Unknown", 0);

    }

    public Book(String title, String author) {

        this(title, author, 0);

    }

    public Book(String title, String author, int year) {

        this.title = title;
        this.author = author;
        this.year = year;

    }

    public String toString() {

        return title + " by " + author + " (" + year + ")";

    }
}
