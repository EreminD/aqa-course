package ru.inno.course.record;

import java.util.Objects;

public class UserClass {
    private int id;
    private String name;
    private int balance;

    public UserClass(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void printBalance(){
        System.out.println(name + "'s balance = " + balance);
    }

    public int addBalance(int balance){
        this.balance += balance;
        return  balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserClass userClass)) return false;
        return getId() == userClass.getId() && getBalance() == userClass.getBalance() && Objects.equals(getName(), userClass.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBalance());
    }

    @Override
    public String toString() {
        return "UserClass[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
