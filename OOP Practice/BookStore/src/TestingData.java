public class TestingData {
    public static void main(String[] args) {
        Book book = new Book ("Under the Yawk", "Ivan Vazov", 15.50);
        System.out.println(book);
        System.out.println();

        GoldenEditionBook goldenEditionBook = new GoldenEditionBook("Tobaco", "Dimityr Dimov", 29.70);
        System.out.println(goldenEditionBook);
    }
}
