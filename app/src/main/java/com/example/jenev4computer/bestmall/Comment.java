package com.example.jenev4computer.bestmall;

public class Comment {

    private String username, comment, date;

    public Comment(String username, String comment, String date) {
        this.username = username;
        this.comment = comment;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }
}
