package com.brain.lab17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex","65468468","alex",Posts.DIRECTOR);
        User use2 = new User("Vova","65468468","vova",Posts.ADMINISTRATOR);
        User use3 = new User("Gena","65468468","gena",Posts.MANAGER);
        User use4 = new User("Vasia","65468468","vasia",Posts.CUSTOMER);
        User use5 = new User("Dima","65468468","dima",Posts.ANONYM);
        Store.userList(user,use2,use3,use4,use5);
        Store store = new Store();
        store.setNameStore("ALLo");
        store.setUrlStore("www.allo.com");
        System.out.println(store);
    }

     static void tryLogin() {
         Store store1 = new Store();
        System.out.println("Введите логин: ");
        Scanner scanner = new Scanner(System.in);
        store1.setLogin(scanner.nextLine());
         System.out.println("Введите пароль: ");
        store1.setPassword(scanner.nextLine());
//         System.out.printf("%s %s%n", store1.getLogin(), store1.getPassword());
    }
}
