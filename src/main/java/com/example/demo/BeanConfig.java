package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.SearchUserDto;
import com.example.demo.entity.SearchUser;
import com.example.demo.repository.UserMapper;

@Configuration
public class BeanConfig {
    @Bean
    public UserMapper getUserMapper()
    {
        return new UserMapper() {
			
			@Override
			public SearchUser search(SearchUserDto searchUserDto) {
				// TODO 自動生成されたメソッド・スタブ
				return null;
			}
		};
    }
}