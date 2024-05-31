package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SearchUserDto;
import com.example.demo.entity.SearchUser;
import com.example.demo.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
public class SearchUserService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
	private UserMapper userMapper;

    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public SearchUser search(SearchUserDto searchUserDto) {
    	
    	SearchUser ret = userMapper.search(searchUserDto);
    	
        return ret;
    }
}