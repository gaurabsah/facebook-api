package com.fb.facebookapi.Repository;

import com.fb.facebookapi.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    ArrayList<Post> findAll();
    Post save(Post post);
    void deleteById(UUID postID);
}
