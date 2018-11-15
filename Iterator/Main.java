public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------BEGIN MAIN--------\n");

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("First Book", bookShelf.getLength() ) );
        bookShelf.appendBook(new Book("Second Book", bookShelf.getLength() ) );
        bookShelf.appendBook(new Book("Third Book", bookShelf.getLength() ) );

        Iterator it = bookShelf.iterator();
        while(it.hasNext() ){
            Book book = (Book) it.next();
            System.out.println(
                "\nBook Index   : " + book.getIndex() +
                "\nBook Name    : " + book.getName() + "\n");
        }

        while(it.hasPrevious() ){
            Book book = (Book) it.previous();
            System.out.println(
                "\nBook Index   : " + book.getIndex() +
                "\nBook Name    : " + book.getName() + "\n");
        }



        System.out.println("\n--------END MAIN--------\n");
    }
}