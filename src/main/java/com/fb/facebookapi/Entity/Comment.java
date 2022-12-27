package com.fb.facebookapi.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID commentID;

    private UUID postID;
    private String userID;

    private String userImage;
    private String userName;

    private Timestamp dateTime;

    public Comment() {
    }

    public Comment(UUID commentID, UUID postID, String userID, String userImage, String userName, Timestamp dateTime) {
        this.commentID = commentID;
        this.postID = postID;
        this.userID = userID;
        this.userImage = userImage;
        this.userName = userName;
        this.dateTime = dateTime;
    }

    public UUID getCommentID() {
        return commentID;
    }

    public void setCommentID(UUID commentID) {
        this.commentID = commentID;
    }

    public UUID getPostID() {
        return postID;
    }

    public void setPostID(UUID postID) {
        this.postID = postID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", postID=" + postID +
                ", userID='" + userID + '\'' +
                ", userImage='" + userImage + '\'' +
                ", userName='" + userName + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
