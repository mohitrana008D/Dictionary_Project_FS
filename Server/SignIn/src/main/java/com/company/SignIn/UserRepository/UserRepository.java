package com.company.SignIn.UserRepository;

import com.company.SignIn.Model.UserModel;
import org.springframework.data.repository.CrudRepository;

//import org.springframework.stereotype.
public interface UserRepository extends CrudRepository<UserModel, String> {
}
