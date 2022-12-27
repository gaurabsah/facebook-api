package com.fb.facebookapi.Service;

import com.fb.facebookapi.Entity.User;

import java.util.ArrayList;

public interface UserService {

    User submitMetaDataOfUser(User user);

    ArrayList<User> retrieveAllUserDetails();

    User getUserData(String userID);
}
