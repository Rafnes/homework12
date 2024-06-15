public class Book {
    private final String name;
    private final Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        if (year < 1600 || year > 2025) {
            System.out.println("Некорректный год издания");
            return;
        }
        this.publicationYear = year;
    }
}