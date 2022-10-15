package operation;

import book.Book;
import book.BookList;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();

        for(int i=0;i<currentSize;i++) {
            if(bookList.getBook(i).getName().equals(name)) {
                for(int j=i+1;j<currentSize;j++) {
                    bookList.setBook(j, bookList.getBook(j + 1));
                }
                bookList.setUsedSize(currentSize-1);
                System.out.println("删除书籍成功！");
                return;
            }
        }
        System.out.println("删除失败！");

    }
}



