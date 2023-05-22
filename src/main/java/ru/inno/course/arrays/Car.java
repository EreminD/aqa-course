package ru.inno.course.arrays;

public class Car {
    private String color;
    private String brand;
    private String model;
    private int hp;
    private String plateNumber;

    public Car(String color, String brand, String model, int hp, String carPlateNumber) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        plateNumber = carPlateNumber;
    }

    public void beep(){
        System.out.println("Beeeeeep!");
    }

    public void boost(int x){
        this.hp += x;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        int doubled = hp * 2;
        this.hp = doubled;
    }

    public String getPlateNumber() {
        return plateNumber;

    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int updateHp(int newHp, String newColor){
        this.hp = newHp;
        return this.hp;

    }
}
