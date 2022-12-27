package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.Post;
import com.fb.facebookapi.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;


    @Override
    public ArrayList<Post> submitPostToDB(Post postData) {
        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime=new Timestamp(time);

        postData.setPostID(UUID.randomUUID());
        postData.setLikes(0);
        postData.setDateTime(dateTime);

        postRepository.save(postData);
        ArrayList<Post> result=retrievePostFromDB();
        return result;
    }

    @Override
    public ArrayList<Post> retrievePostFromDB() {
        ArrayList<Post> result=postRepository.findAll();
        return result;
    }

    @Override
    public ArrayList<Post> deletePostFromDB(UUID postID) {
        postRepository.deleteById(postID);

        ArrayList<Post> result=retrievePostFromDB();
        return result;
    }
}
