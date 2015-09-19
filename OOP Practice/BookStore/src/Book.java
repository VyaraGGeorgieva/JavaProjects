import java.math.BigDecimal;

public class Book {

    private String title;
    private String author;
    private BigDecimal price;

    protected Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = new BigDecimal(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.length()==0) {
            throw new IllegalArgumentException("The title cannot be null");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.length() == 0) {
            throw new IllegalArgumentException("The author cannot be empty");
        }
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (price.doubleValue()<=0){
            throw new ArithmeticException("The price cannot be zero or negative");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return
                String.format("Type: " + Book.class.getName() + "; Title: " + this.getTitle() + "; Author: " + this.getAuthor() + "; Price: " + this.getPrice().doubleValue());
    }
}
