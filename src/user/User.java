package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;  //用户名
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperaion(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }
}

