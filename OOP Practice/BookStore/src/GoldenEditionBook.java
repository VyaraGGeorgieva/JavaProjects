import java.math.BigDecimal;

public class GoldenEditionBook extends Book{

    private static final BigDecimal OVER_VALUE = new BigDecimal("0.3");

    protected GoldenEditionBook(String title, String author, double price) {super(title, author, price);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(super.getPrice().multiply(OVER_VALUE));
    }

    @Override
    public String toString() {
        return
                String.format("Type: " + GoldenEditionBook.class.getName() + "; Title: " + this.getTitle() + "; Author: " + this.getAuthor() + "; Price: " + this.getPrice().doubleValue());
    }
}
