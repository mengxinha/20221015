package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还图书的名字：");
        String name = scanner.nextLine();


        int currentSize = bookList.getUsedSize();
        for(int i=0;i<currentSize;i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {

                book.setBorrowed(false);
                System.out.println("归还成功!");
                return;
            }

        }
    }
}
