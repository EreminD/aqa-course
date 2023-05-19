package ru.inno.course.oop;

public class Employee {

    private String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // public | private - можно вызывать откуда угодно
    // void | String | double | int | int[] | User - тип возвращаемого значения
    // setBonus - название
    // ( double rate, String name, ...) - параметры

    public void setBonus( double rate ){
        // вызов метода из метода
        double checkedRate = checkRate(rate);

        this.salary = this.salary * (1+checkedRate);
        System.out.println("Увеличиваем зп для "+ this.name + ": " + this.salary);
    }

    private double checkRate( double rateToCheck){
        if (rateToCheck > 0.2){
            rateToCheck = 0.2;
        }

        if (rateToCheck < 0) {
            rateToCheck = 0;
        }

        return rateToCheck;
    }

    public String getName(){
        return this.name;
    }
}
