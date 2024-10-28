package com.example.demo.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class UserController {

  /**
   * ユーザー情報 Service
   */
  @Autowired
  UserService userService;

  /**
   * ユーザー情報一覧画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面のHTML
 * @throws ParseException 
   */
  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
  public String displayList(Model model) throws ParseException {
    User user = userService.search();
    model.addAttribute("user", user);
    return "user/list";
  }
}