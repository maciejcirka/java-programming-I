
public class Book {
    
    private String title;
    private String publisher;
    private int year;
    
    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }
    
    //public String title(), public String publisher(), public int year() and public String toString()
    
    
    public String title() {
        return this.title;
    }
    
    public String publisher() {
        return this.publisher;
    }
    
    public int year() {
        return this.year;
    }
    
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }
}
