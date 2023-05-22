package ru.inno.course.oop;

public class Card {
    private String number;
    private String pinCode;

    public Card(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public String getNumber(){
        String replace = number.replace(" ", "");
        String lastFourDigits = replace.substring(replace.length()-4);
        return "**** ".repeat(3).concat(lastFourDigits);
    }

    public String getNumber(String pinCode){
        if (pinCode.equals(this.pinCode)) {
            return this.number;
        } else {
            return "Not authorized.";
        }
    }
}
