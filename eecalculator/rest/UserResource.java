package com.hylston.eecalculator.rest;

import com.hylston.eecalculator.model.User;
import com.hylston.eecalculator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/user")
@CrossOrigin
public class UserResource {



    @RequestMapping(path="", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(
            @RequestParam(value = "login")
            String login,
            @RequestParam(value = "password")
            String password
    ){
        User user = new User();//userService.findUserByLoginAndPassword(login, password);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path="" )
    public ResponseEntity<User> createUser(
            @RequestParam(value = "login")
                    String login,
            @RequestParam(value = "password")
                    String password,
            @RequestParam(value = "email")
                    String email,
            @RequestParam(value = "fname")
                    String fname,
            @RequestParam(value = "lname")
                    String lname
    ){
        User user = new User();
       // user = userService.save(user);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path="", method = RequestMethod.POST)
    public void test(

    ){

        System.out.println("Test");

    }

    @RequestMapping(path="", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(
            @RequestParam(value = "id")
                    Long id,
            @RequestParam(value = "login")
                    String login,
            @RequestParam(value = "password")
                    String password,
            @RequestParam(value = "email")
                    String email,
            @RequestParam(value = "fname")
                    String fname,
            @RequestParam(value = "lname")
                    String lname
    ){
        User user = new User();
        user.setId(id);
        //user = userService.save(user);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path="", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(
            @RequestParam(value = "id")
                    Long id
    ){
        User user = new User();

        user.setId(id);

        //userService.detele(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
