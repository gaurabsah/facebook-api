package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.Comment;
import com.fb.facebookapi.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserService userService;


    @Override
    public Comment saveComment(Comment comment) {
        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime=new Timestamp(time);

        comment.setCommentID(UUID.randomUUID());
        comment.setDateTime(dateTime);
        return commentRepository.save(comment);
    }

    @Override
    public ArrayList<Comment> getAllComment(UUID postID) {
        ArrayList<Comment> result =new ArrayList<Comment>();
        result = commentRepository.findAllByPostID(postID);
        return result;
    }
}
