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

    @Override
    public String toString() {
        return String.format("Название: %s, %s, Год издания: %s", name, author, publicationYear);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != this.getClass() || obj == null) {
            return false;
        }
        Book book = (Book) obj;
        boolean result;
        result = this.name.equals(book.name) && this.author.equals(book.author);
        result = this.publicationYear == book.publicationYear;
        return result;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, publicationYear);
    }
}