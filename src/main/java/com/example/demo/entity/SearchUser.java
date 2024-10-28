package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class SearchUser {

    /**
     * ID
     */
    private Long id;

    /**
     * 名前
     */
    private String name;

    /**
     * 誕生日
     */
    private String birthday;

    /**
     * 年齢
     */
    private Integer age;

    /**
     * 血液型
     */
    private String bloodType;

    /**
     * 出身地
     */
    private String birthplace;

    /**
     * 職業
     */
    private String occupation;

    /**
     * 趣味
     */
    private String hobby;

    /**
     * スポーツ経験
     */
    private String sports;

    /**
     * 更新日時
     */
    private Date updateDate;

    /**
     * 登録日時
     */
    private Date createDate;

    /**
     * 削除日時
     */
    private Date deleteDate;
}