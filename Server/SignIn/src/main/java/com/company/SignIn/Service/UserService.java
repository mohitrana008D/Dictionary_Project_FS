package com.company.SignIn.Service;
import com.company.SignIn.Model.UserModel;
import com.company.SignIn.UserRepository.UserRepository;

//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//import  jdk.internal.org.jline.utils.Colors.s;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();
       userRepository.findAll().forEach(userModel -> users.add(userModel));
        return users;

    }
    public UserModel createUser(UserModel user)   {

        userRepository.save(user);
        return user;
    }
//    public UserModel editUser(String user,UserModel updatedUser)   {
//
//        for(int i=0;i<UserModel.size();i++) {
//            UserModel u = UserModel.get(i);
//            if (s.getName().equals(user)) {
//                UserModel.set(i, updatedUser);
//            }
//        }
//    }
}
