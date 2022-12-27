package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.User;
import com.fb.facebookapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User submitMetaDataOfUser(User user) {
        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime=new Timestamp(time);

        user.setActive(true);
        user.setJoiningDate(dateTime);

        return userRepository.save(user);
    }

    @Override
    public ArrayList<User> retrieveAllUserDetails() {
        return userRepository.findAll();
    }

    @Override
    public User getUserData(String userID) {
        return userRepository.findAllByUserID(userID);
    }
}
