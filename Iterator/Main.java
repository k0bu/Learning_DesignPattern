public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------BEGIN MAIN--------\n");

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("First Book") );
        bookShelf.appendBook(new Book("Second Book") );
        bookShelf.appendBook(new Book("Third Book") );

        Iterator it = bookShelf.iterator();
        while(it.hasNext() ){
            Book book = (Book) it.next();
            System.out.println("\nBook Name: " + book.getName() + "\n");
        }





        System.out.println("\n--------END MAIN--------\n");
    }
}