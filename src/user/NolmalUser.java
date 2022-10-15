package user;

import operation.*;


import java.util.Scanner;

public class NolmalUser extends User{

    public NolmalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public int menu(){
        System.out.println("hello " +this.name+"欢迎来到图书小练习");
        System.out.println("1,查找图书！");
        System.out.println("2,借阅图书！");
        System.out.println("3,归还图书！");
        System.out.println("0,退出系统！");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;



    }
}
