package com.hiteach.controller;

import com.hiteach.entity.User;
import com.hiteach.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthenController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/keyactive", method = RequestMethod.GET)
    public void activeAccount(@RequestParam("key") String key){
        User u =userRepository.getUserByActivationKey(key).get();
        u.setActived(1);
        userRepository.save(u);
    }
}
