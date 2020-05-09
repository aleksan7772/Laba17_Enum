package com.brain.lab17;

public class User {
    private String login;
    private String password;
    private String name;
    private Posts role = Posts.ANONYM;

    public User(String login, String password, String name, Posts role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public User(Boolean login, String password, String name) {

    }

    public User() {

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Posts getRole() {
        return role;
    }

    public void setRole(Posts role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "login=" + login +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
