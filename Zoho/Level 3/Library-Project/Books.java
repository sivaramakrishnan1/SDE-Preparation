public class Books {    
    private int bookID = 0;
    private String bookName = "";
    private String author = "";
    private int price = 0;
    private int quantity = 0;
    private int positionRow = 0;
    private int positionColumn = 0;
    /*
     * Books - Constructor to create the object for book.
     */
    Books(int id, String name, String author, int price, int posRow, int posCol) {
        this.bookID = id;
        this.bookName = "";
        this.author = "";
        this.price = 0;
        this.quantity = 0;
        this.positionRow = 0;
        this.positionColumn = 0;        
    }
}
