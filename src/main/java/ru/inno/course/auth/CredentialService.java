package ru.inno.course.auth;

public class CredentialService {

    public static void main(String[] args) {
        Credential credential = new Credential("User1" , "Pass1");
        if(credential.getLogin().equals("User1") && credential.getPass().equals("Pass1")){
            System.out.println("Hello User1");
        } else {
            System.out.println("Access denied");
        }
    }
}

