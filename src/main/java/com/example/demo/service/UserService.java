package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService {

    /**
     * ユーザー情報 Repository
     */
    @Autowired
    UserRepository userRepository;

    public User search() throws ParseException {
        User user = new User();

        // ユーザーTBLの内容を検索
        List<User> userlist = userRepository.findAll();

        if (userlist.size() >= 1) {
            user = userlist.get(0);

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年 MM月 dd日");
            Date birthday = sdf1.parse(user.getBirthday());
            user.setBirthday(sdf2.format(birthday));
        }

        return user;
    }

    public List<User> searchAll() {
        // ユーザーTBLの内容を全検索
        return userRepository.findAll();
    }
}