package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.Comment;

import java.util.ArrayList;
import java.util.UUID;

public interface CommentService {

    Comment saveComment(Comment comment);

    ArrayList<Comment> getAllComment(UUID postID);
}
