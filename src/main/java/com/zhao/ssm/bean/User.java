package com.zhao.ssm.bean;

/**
 * Created by zhao on 2017/3/27.
 */
public class User {
    private int id;
    private String user_name;
    private String password;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        if (!user_name.equals(user.user_name)) return false;
        return password.equals(user.password);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + user_name.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + age;
        return result;
    }

    public User(int id, String user_name, String password, int age) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
