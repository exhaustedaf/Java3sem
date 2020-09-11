public class Book {
    private String name;
    private int pageQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public Book(String name, int pageQuantity) {
        this.name = name;
        this.pageQuantity = pageQuantity;
    }

    public Book() {
        name = "1984";
        pageQuantity = 320;
    }

    public Book(int pageQuantity) {
        this.pageQuantity = pageQuantity;
        name = "1984";
    }

    public Book(String name) {
        this.name = name;
        pageQuantity = 234;
    }

    public String toString() {
        return "The book is called " + this.getName() +
                " and has " + this.getPageQuantity() + " pages";
    }
}
