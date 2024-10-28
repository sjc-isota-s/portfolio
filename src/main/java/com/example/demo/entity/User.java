package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "user")
public class User {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名前
     */
    @Column(name = "name")
    private String name;

    /**
     * 誕生日
     */
    @Column(name = "birthday")
    private String birthday;

    /**
     * 年齢
     */
    @Column(name = "age")
    private Integer age;

    /**
     * 血液型
     */
    @Column(name = "blood_type")
    private String bloodType;

    /**
     * 出身地
     */
    @Column(name = "birthplace")
    private String birthplace;

    /**
     * 職業
     */
    @Column(name = "occupation")
    private String occupation;

    /**
     * 趣味
     */
    @Column(name = "hobby")
    private String hobby;

    /**
     * スポーツ経験
     */
    @Column(name = "sports")
    private String sports;

    /**
     * 更新日時
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 登録日時
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 削除日時
     */
    @Column(name = "delete_date")
    private Date deleteDate;
}