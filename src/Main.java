//整合部分


import book.BookList;
import user.AdminUser;
import user.NolmalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("请输入你的身份： 1->管理员  0->普通用户");
        int choice = scanner.nextInt();

        if(choice==1) {
            return new AdminUser(name);
        }else{
            return new NolmalUser(name);
        }
    }


    public static void main(String[] args) {
        BookList bookList = new BookList();
        //登陆
        User user = login();  //向上转型
       while(true){

           int choice =user.menu();  //动态绑定
           user.doOperaion(choice,bookList);
       }


    }
}
