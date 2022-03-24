package Book;

public class myfavbook {

    private String bookname;
    private String author;
    private int bookprice;
    private int yearofrelease;
    private int noOfCopiesSold;

    public myfavbook(String bookname, String author, int bookprice, int yearofrelease, int noOfCopiesSold) {
        this.bookname = bookname;
        this.author = author;
        this.bookprice = bookprice;
        this.yearofrelease = yearofrelease;
        this.noOfCopiesSold = noOfCopiesSold;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    public int getYearofrelease() {
        return yearofrelease;
    }

    public void setYearofrelease(int yearofrelease) {
        this.yearofrelease = yearofrelease;
    }

    public int getNoOfCopiesSold() {
        return noOfCopiesSold;
    }

    public void setNoOfCopiesSold(int noOfCopiesSold) {
        this.noOfCopiesSold = noOfCopiesSold;
    }
}