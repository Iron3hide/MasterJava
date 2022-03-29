package Book;

public class bookRunner {
    public static void main(String[] args)
    {
        book bk = new book(10,"Steve Jobs","William Isaacson");
        bk.addReview(new Review(1,"Brilliant",4));
        bk.addReview(new Review(2,"Exceptional piece of work",5));
        bk.addReview(new Review(3,"Good Job",4));
        bk.addReview(new Review(4,"Exquisite",5));

        System.out.println(bk);
    }
}
