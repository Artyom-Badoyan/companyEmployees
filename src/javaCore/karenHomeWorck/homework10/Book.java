package javaCore.karenHomeWorck.homework10;

public class Book {

    private String title;
    private double price;
    private String author;

    public Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(getPrice(), book.getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        return getAuthor() != null ? getAuthor().equals(book.getAuthor()) : book.getAuthor() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getTitle() != null ? getTitle().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", price=" + price + ", author='" + author + '\'' + '}';
    }
}
