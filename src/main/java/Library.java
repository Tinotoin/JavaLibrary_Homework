//import java.awt.print.Book;
//        import java.awt.print.Book;
        import java.awt.print.Book;
        import java.util.ArrayList;

public class Library {


    private ArrayList<Book> book;
    private String title;
    private String genre;
    private int capacity;

    public Library() {
        this.book = new ArrayList<Book>();
//        this.title = title;
//        this.genre = genre;
        this.capacity = 10;


    }

    public int bookCount(){
        return this.book.size();
    }

    public void addBook(Book books){
        if (this.capacity < 10){
            book.add(book); // unsure why this is showing as an error
        }else{
            System.out.println("Sorry, the library is full!");
        }
    }


}
