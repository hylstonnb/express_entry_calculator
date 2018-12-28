package com.hylston.eecalculator.repository;

import com.hylston.eecalculator.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    //User findUserByLoginAndPassword(String login, String password);
}
