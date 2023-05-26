package ru.inno.course.oop;

public class Card {
    private String number;
    private String pinCode;
    private String maskedNumber;

    public Card(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
        maskNumber();
    }

    public String getNumber(){
        return maskedNumber;
    }

    public String getNumber(String pinCode){
        if (pinCode.equals(this.pinCode)) {
            return this.number;
        } else {
            return "Not authorized.";
        }
    }

    private void maskNumber(){
        String replace = number.replace(" ", "");
        String lastFourDigits = replace.substring(replace.length()-4);
        this.maskedNumber = "**** ".repeat(3).concat(lastFourDigits);
    }
}
