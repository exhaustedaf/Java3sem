public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1);
        Book book2 = new Book("We");
        System.out.println(book2);
        Book book3 = new Book("Animal Farm", 288);
        System.out.println(book3);
        Book book4 = new Book(320);
        System.out.println(book4);
    }
}
