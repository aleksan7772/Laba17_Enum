package com.brain.lab17;

import java.util.Arrays;

import static com.brain.lab17.Main.*;

public class Store extends User {
    private String nameStore;
    private String urlStore;
    private String[] users;
    private String authorizedUser;

    public Store(Boolean login, String password, String name) {
        super(login, password, name);
    }

    public Store() {
        super();
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

    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public String getAuthorizedUser() {
        return authorizedUser;
    }

    public void setAuthorizedUser(String authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    public static Boolean login(Store store) {
        User user = new User();
        tryLogin();
        return user.getLogin().equals(store.getLogin()) & user.getPassword().equals(store.getPassword());
    }

    void getCurrentUserRights() {
        switch (getRole()) {
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

    public static void userList(User...users) {
        for (User user : users) {

        }
    }

    private Store[] setUsers() {
        return new Store[0];
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

