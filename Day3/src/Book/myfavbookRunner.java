package Book;

public class myfavbookRunner {

    public static void main(String[] args){
     myfavbook book = new myfavbook("Steve Jobs", "Walter Isaacson",150, 2010, 1000);

     System.out.println("Original name:"+ book.getBookname());
     book.setBookname("Life of Jobs");
     System.out.println("New name:"+ book.getBookname());
     System.out.println();

     System.out.println("Original Price is:" + book.getBookprice());
     book.setBookprice(200);
     System.out.println("New Price is:" + book.getBookprice());
     System.out.println();

     System.out.println("Initial no. of copies sold in first year:" + book.getNoOfCopiesSold());
     book.setNoOfCopiesSold(1200);
     System.out.println("Corrected no. of copies sold:" + book.getNoOfCopiesSold());
     System.out.println();

     System.out.println("Original year of release:" + book.getYearofrelease());
     book.setYearofrelease(2008);
     System.out.println("Corrected year of release:" + book.getYearofrelease());
     System.out.println();
    }
}