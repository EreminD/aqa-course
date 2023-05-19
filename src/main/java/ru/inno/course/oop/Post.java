package ru.inno.course.oop;

public class Post {

    String url;
    String[] comments;
    String publishDate;
    private int likes;

    public Post(){
        this.likes = 0;
    }

    public void incrementLike(){
        this.likes += 1;
    }

}