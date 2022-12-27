package com.fb.facebookapi.Controller;

import com.fb.facebookapi.Entity.Comment;
import com.fb.facebookapi.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/api/commentService")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/save")
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping("/getAllComments/{postID}")
    public ArrayList<Comment> getAllComments(@PathVariable("postID") UUID postID){
        return commentService.getAllComment(postID);

    }
}
