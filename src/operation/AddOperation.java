package operation;
import book.Book;
import book.BookList;

import java.util.List;
import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("增加图书");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的类型：");
        String type = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setBook(currentSize,book);

        bookList.setUsedSize(currentSize+1);

        System.out.println("新增书籍成功！");

    }
}
