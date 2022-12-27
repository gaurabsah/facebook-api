package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.Post;

import java.util.ArrayList;
import java.util.UUID;

public interface PostService {

    ArrayList<Post> submitPostToDB(Post postData);

    ArrayList<Post> retrievePostFromDB();

    ArrayList<Post> deletePostFromDB(UUID postID);
}
