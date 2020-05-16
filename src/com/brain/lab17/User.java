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
    public boolean isLoginCorrect(String login) {
        return login.equals(this.login);
    }
    protected boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return role == user.role;
    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
