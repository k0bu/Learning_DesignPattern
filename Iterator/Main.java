public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------BEGIN MAIN--------\n");

        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("First Book", bookShelf.getLength() ) );
        bookShelf.appendBook(new Book("Second Book", bookShelf.getLength() ) );
        bookShelf.appendBook(new Book("Third Book", bookShelf.getLength() ) );

        Iterator it = bookShelf.iterator();

        listBookShelfAscendingO(it);

        it.indexToFirst();

        listBookShelfAscendingO(it);

        listBookShelfDescendingO(it);

        it.indexToLast();

        listBookShelfDescendingO(it);



        System.out.println("\n--------END MAIN--------\n");
    }

    private static void listBookShelfAscendingO(Iterator iterator){
        while(iterator.hasNext() ){
            Book book = (Book) iterator.next();
            System.out.println(
                "\nBook Index   : " + book.getIndex() +
                "\nBook Name    : " + book.getName() + "\n");
        }
    }

    private static void listBookShelfDescendingO(Iterator iterator){
        while(iterator.hasPrevious() ){
            Book book = (Book) iterator.previous();
            System.out.println(
                "\nBook Index   : " + book.getIndex() +
                "\nBook Name    : " + book.getName() + "\n");
        }
    }
}