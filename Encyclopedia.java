public class Encyclopedia extends Book {
    private String edition;
    private int numberOfPages;

    public Encyclopedia(String title, String author, String publisher, String publicationDate, String edition, int numberOfPages) {
        super(title, author, publisher, publicationDate);
        this.edition = edition;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numberOfPages);
    }
}