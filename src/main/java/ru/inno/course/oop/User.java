package ru.inno.course.oop;

public class User {

    //свойства (properties)
    String name;
    int age;
    String email;
    String phone;
    boolean isOnline;
    double rating;
    String nickname;

    public User( String futureEmail, String futureName, int futureAge  ){
        email = futureEmail;
        name = futureName;
        age = futureAge;
        isOnline = true;
        rating = 10;
        phone = "";
        nickname = email;
    }

}
