package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.SearchUserDto;
import com.example.demo.entity.SearchUser;
import com.example.demo.service.SearchUserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class SearchUserController {
  /**
   * ユーザー情報 Service
   */
  @Autowired
  SearchUserService searchUserService;

  /**
   * ユーザー情報検索画面を表示
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/user/search")
  public String displaySearch(Model model) {
    model.addAttribute("searchUserDto", new SearchUserDto());
    return "user/search";
  }

  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping(value = "/user/id_search", method = RequestMethod.POST)
  public String search(@ModelAttribute SearchUserDto searchUserDto, Model model) {
    SearchUser user = searchUserService.search(searchUserDto);
    model.addAttribute("userinfo", user);
    return "user/search";
  }
}