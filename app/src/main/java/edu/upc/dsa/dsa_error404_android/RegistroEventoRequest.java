package edu.upc.dsa.dsa_error404_android;

public class RegistroEventoRequest {
    private String username;

    public RegistroEventoRequest(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
