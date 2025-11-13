package edu.upc.dsa.dsa_error404_android;

public class User {
    private String id;
    private String username;
    private String password;

    public User(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return username;
    }

}