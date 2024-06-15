public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ги", "де Мопассан");
        Book book1 = new Book("Жизнь", author1, 1863);
        Author author2 = new Author("Стивен", "Кинг");
        Book book2 = new Book("Оно", author2, 1986);

        book1.setPublicationYear(1999);
    }
}
