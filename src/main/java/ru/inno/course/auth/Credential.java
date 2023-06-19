package ru.inno.course.auth;

import java.util.Objects;

public class Credential {
    private String login;
    private String pass;

    public Credential(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Credential that)) return false;
        return Objects.equals(login, that.login) && Objects.equals(pass, that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, pass);
    }

    @Override
    public String toString() {
        return "Credential{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
