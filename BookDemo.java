public class BookDemo {
    public static void main(String[] args) {
        // Create a regular book
        Book book1 = new Book("The Hobbit", "J. R. R. Tolkien", "George Allen & Unwin", "21 September 1937");

        // Create an encyclopedia
        Encyclopedia encyclopedia1 = new Encyclopedia(
            "The Illustrated Encyclopedia of the Universe", 
            "Ian Ridpath", 
            "Watson-Guptill", 
            "2001", 
            "2nd", 
            384
        );

        // Print information for the regular book
        System.out.println("CBook Information:");
        book1.printInfo();

        // Print information for the encyclopedia
        System.out.println("Book Information:");
        encyclopedia1.printInfo();
    }
}