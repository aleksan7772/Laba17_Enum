package com.brain.lab17;

import java.util.Arrays;


public class Store {
    private String nameStore;
    private String urlStore;
    private User[] users;
    private User authorizedUser;

    public Store(String allo, String s) {
    }

    public Store() {
    }


    public boolean login(String login, String passwords) {
        for (User user : userList(users)) {
            if (user.isLoginCorrect(login)) {
                if (user.isPasswordCorrect(passwords)) {
                    authorizedUser = user;
                    System.out.println("Авторизация прошла успешно");
                    return true;
                } else break;
            }
        }
        System.out.println("Неверный логин или пароль");
        return false;
    }

    public Store(String nameStore, String urlStore, User[] users, User authorizedUser) {
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
        return String.valueOf(authorizedUser);
    }

    public void setAuthorizedUser(User authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    void getCurrentUserRights() {
        switch (authorizedUser.getRole()) {
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
            default:
                throw new IllegalStateException("Unexpected value: " + authorizedUser.getRole());
        }

    }

    public void logout() {
        authorizedUser = null;
        System.out.println("Пользователь вышел из системы");
    }

    public static User[] userList(User... users) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (nameStore != null ? !nameStore.equals(store.nameStore) : store.nameStore != null) return false;
        if (urlStore != null ? !urlStore.equals(store.urlStore) : store.urlStore != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(users, store.users)) return false;
        return authorizedUser != null ? authorizedUser.equals(store.authorizedUser) : store.authorizedUser == null;
    }

    @Override
    public int hashCode() {
        int result = nameStore != null ? nameStore.hashCode() : 0;
        result = 31 * result + (urlStore != null ? urlStore.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(users);
        result = 31 * result + (authorizedUser != null ? authorizedUser.hashCode() : 0);
        return result;
    }
}

