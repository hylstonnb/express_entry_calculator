package com.hylston.eecalculator.service;

import com.hylston.eecalculator.model.User;
import com.hylston.eecalculator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {


//    private UserRepository userRep;
//
//    public List<User> getUserList(){
//
//        Iterable<User> iter = userRep.findAll();
//
//        List<User> userList = new ArrayList<>();
//
//        for (User user: iter) {
//
//            userList.add(user);
//        }
//
//        return userList;
//    }
//
//    public User findUserByLoginAndPassword(String login, String password){
//
//        return userRep.findUserByLoginAndPassword(login, password);
//    }
//
//    public User save(User user){
//
//        return userRep.save(user);
//    }
//
//    public void detele(User user){
//
//        userRep.delete(user);
//    }

}
