package com.fb.facebookapi.Repository;

import com.fb.facebookapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User save(User user);
    ArrayList<User> findAll();
    User findAllByUserID(String userID);
}
