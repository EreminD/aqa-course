package ru.inno.course.oop;

public class SocialMedia {

    public static void main(String[] args) {

        Post post = new Post();

//        post.likes = 1000000; // проблема
        System.out.println(post); // 0

        post.incrementLike();
        post.incrementLike();
        post.incrementLike();
        post.incrementLike();
        post.incrementLike();
        post.incrementLike();
        System.out.println(); // 1


    }
}
