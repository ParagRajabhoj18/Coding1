public class Book {
    private int bookId;
    private float bookPrice;
    static int count;

    Book(){
        count++;
        this.bookId=count;
        this.bookPrice=100;
    }

    public void setPrice(int pr){
        this.bookPrice=pr;
    }

    public void Display(){
        System.out.println("Book Id is:- "+bookId);
        System.out.println("Book Price is:- "+bookPrice);
    }


    public static void main(String[] args) {
        Book b1=new Book();
        b1.Display();

        Book b2=new Book();
        b2.setPrice(200);
        b2.Display();   
    }

}


