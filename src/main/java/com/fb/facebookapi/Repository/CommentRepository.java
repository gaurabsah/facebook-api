package com.fb.facebookapi.Repository;

import com.fb.facebookapi.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface CommentRepository extends JpaRepository<Comment, UUID> {

    Comment save(Comment comment);

    ArrayList<Comment> findAllByPostID(UUID postID);
}
