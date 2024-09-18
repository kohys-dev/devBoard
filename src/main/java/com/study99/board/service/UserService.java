package com.study99.board.service;

import com.study99.board.entity.User;
import com.study99.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    public String register(User user){


        return "Register Success";
    }

}
