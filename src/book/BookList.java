package book;

public class BookList {
    private Book[] books = new Book[10];

    private int usedSize;   //实时记录，当前数组中有多少本书

    public BookList() {
        books[0] = new Book("三国演义", "罗贯中", 37, "小说");
        books[1] = new Book("西游记", "吴承恩", 32, "小说");
        books[2] = new Book("红楼梦", "曹雪芹", 47, "小说");

        usedSize = 3;
    }

    public Book getBook(int pos){
        return books[pos];
    }

    public void setBook(int pos,Book book){
        books[pos]=book;
    }

    public int getUsedSize(){   //实时获取当前书的个数
        return usedSize;
    }

    public void setUsedSize(int size){
        this.usedSize=size;

    }

}
