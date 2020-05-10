package com.brain.lab17;

import java.util.Arrays;
import java.util.Objects;

import static com.brain.lab17.Posts.*;


public class Store  {
    private String nameStore;
    private String urlStore;
    private User[] users;
    private String authorizedUser;

    public Store(String allo, String s) {
    }

    public Store() {

    }


    public static Boolean login(Store store) {
        User user = new User();
        for (int i = 0; i < store.getUsers().length; i++) {
            User storeUser = store.getUsers()[i];

        }
//        return user.getLogin().equals(store.getLogin()) & user.getPassword().equals(store.getPassword());
        return true;
    }

    public Store(String nameStore, String urlStore, User[] users, String authorizedUser) {
        this.nameStore = nameStore;
        this.urlStore = urlStore;
        this.users = users;
        this.authorizedUser = authorizedUser;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getUrlStore() {
        return urlStore;
    }

    public void setUrlStore(String urlStore) {
        this.urlStore = urlStore;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public String getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(String authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    void getCurrentUserRights(User user) {
        switch (user.getRole()) {
            case ANONYM:
                System.out.println("Анонимный пользователь, может покупать товары и или авторизоваться");
                break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами");
                break;
            case CUSTOMER:
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                break;
            case DIRECTOR:
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
                break;
            case ADMINISTRATOR:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
        }

    }

    public static String logout(Store store) {
        store.setAuthorizedUser(null);
        System.out.println("Пользователь вышел из системы");
        return store.getAuthorizedUser();
    }

    public static User[] userList(User...users) {
        for (User user : users) {
        }
        return users;
    }

    @Override
    public String toString() {
        return "Store{" +
                "nameStore='" + nameStore + '\'' +
                ", urlStore='" + urlStore + '\'' +
                ", users=" + Arrays.toString(users) +
                ", authorizedUser='" + authorizedUser + '\'' +
                '}';
    }
}

