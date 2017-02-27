package com.store.model;

public class User extends BaseBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.gender
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private Boolean gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.grade
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private Integer grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.headimg
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String headimg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phonenum
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String phonenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.qq
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.weixin
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    private String weixin;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public User(Long id, String username, String password, Boolean gender, Integer age, String address, Integer grade, String headimg, String phonenum, String qq, String weixin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.grade = grade;
        this.headimg = headimg;
        this.phonenum = phonenum;
        this.qq = qq;
        this.weixin = weixin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.gender
     *
     * @return the value of user.gender
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.grade
     *
     * @return the value of user.grade
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.headimg
     *
     * @return the value of user.headimg
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getHeadimg() {
        return headimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phonenum
     *
     * @return the value of user.phonenum
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.qq
     *
     * @return the value of user.qq
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.weixin
     *
     * @return the value of user.weixin
     *
     * @mbggenerated Sun Feb 26 23:57:38 CST 2017
     */
    public String getWeixin() {
        return weixin;
    }
}