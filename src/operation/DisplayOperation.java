package operation;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int currentSize = bookList.getUsedSize();
        for(int i=0;i<currentSize;i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
