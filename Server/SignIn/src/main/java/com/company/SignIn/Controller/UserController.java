package com.company.SignIn.Controller;

import com.company.SignIn.Model.UserModel;
import com.company.SignIn.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins="*")
class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.GET,value="/users")
    public List<UserModel> getAllUsers(){
        return userService.getAllUsers();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public UserModel createUser(@RequestBody UserModel user){
        return userService.createUser(user);
    }


//    @RequestMapping(method = RequestMethod.PUT, value = "/users/{name}")
//    public UserModel editUser(@PathVariable String name,@RequestBody UserModel users){
//    userService.editUser(name, users);
//    return users;
//    }
}