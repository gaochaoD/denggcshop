package com.denggc3.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * Created by youfan on 2018/6/6 0006.
 * @author denggc
 */
@Data
@TableName(value = "user")
public class User {
    /**
     * 主键
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 密码
     */
    private String passwordencrypt;
    /**
     * 地址
     */
    private String address;
    /**
     * 手机号
     */
    private String telphone;
    /**
     * qq
     */
    private String qq;
    /**
     * 微信
     */
    private String weixin;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别
     */
    private String sex;
    /**
     * 用户名
     */
    private String account;
    /**
     * 生日时间
     */
    private String birthday;
}
