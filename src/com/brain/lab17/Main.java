package com.brain.lab17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex", "65468468", "alex", Posts.DIRECTOR);
        User use2 = new User("Vova", "65468468", "vova", Posts.ADMINISTRATOR);
        User use3 = new User("Gena", "65468468", "gena", Posts.MANAGER);
        User use4 = new User("Vasia", "65468468", "vasia", Posts.CUSTOMER);
        User use5 = new User("Dima", "65468468", "dima", Posts.ANONYM);
        Store store = new Store("allo","www.allo.com");
        store.setUsers(Store.userList(user, use2, use3, use4, use5));
        for (; ; ) tryLogin(store);
    }

    static void tryLogin(Store store) {
        System.out.println("Введите логин: ");
        Scanner inputLogin = new Scanner(System.in);
        Scanner inputPassword = new Scanner(System.in);
        String login = inputLogin.nextLine();
        System.out.println("Введите пароль: ");
        String password = inputPassword.nextLine();
        if (store.login(login, password)) {
            store.getCurrentUserRights();
            store.logout();
        }
    }
}
