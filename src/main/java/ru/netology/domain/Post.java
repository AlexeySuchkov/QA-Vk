package ru.netology.domain;

public class Post {
    private int postId;
    private int posterId;
    private int fromId;
    private int replyOwnerId;
    private int replyPostId;
    private String posterName;
    private String postDate;
    private String text;
    private String imageUrl;
    //TODO все объекты из API VK
    .............
    private Like like;
    private Views views;
    private Repost repost;
    private CommentsInfo commentsInfo;

    // + get/set на все поля
}
