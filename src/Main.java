public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author firstAuthor = new Author("Аркадий и Борис", "Стругацкие");
        Author secondAuthor = new Author("Том", "Клэнси");

        // Создаем книги
        Book firstBook = new Book("Пикник на обочине", firstAuthor, 1971);
        Book secondBook = new Book("Red Rabbit", secondAuthor, 2002);

        // Выводим информацию о книгах
        printBookInfo(firstBook);
        printBookInfo(secondBook);

        // Изменяем год публикации одной из книг
        firstBook.setPublicationYear(1972);

        // Выводим обновленную информацию
        System.out.println("\nПосле изменения года публикации:");
        printBookInfo(firstBook);
    }

    public static void printBookInfo(Book book) {
        System.out.println("Название: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("Год публикации: " + book.getPublicationYear());
        System.out.println();
    }
}