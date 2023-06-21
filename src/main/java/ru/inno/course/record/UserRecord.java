package ru.inno.course.record;

public record UserRecord(int id, String name, int balance) {

    public void printBalance(){
        System.out.println(this.name + "'s balance = " + this.balance);
    }

    public UserRecord addBalance(int balance){
        return new UserRecord(this.id, this.name, this.balance + balance);
    }
}
