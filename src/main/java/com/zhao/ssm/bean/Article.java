package com.zhao.ssm.bean;

import java.util.Date;

public class Article {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.uid
     *
     * @mbggenerated
     */
    private Integer uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.sort_id
     *
     * @mbggenerated
     */
    private Integer sortId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.keys
     *
     * @mbggenerated
     */
    private String keys;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.info
     *
     * @mbggenerated
     */
    private String info;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.addtime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.scancount
     *
     * @mbggenerated
     */
    private Integer scancount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.ontop
     *
     * @mbggenerated
     */
    private Integer ontop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.isdelete
     *
     * @mbggenerated
     */
    private Integer isdelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.item1
     *
     * @mbggenerated
     */
    private String item1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.item2
     *
     * @mbggenerated
     */
    private String item2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    public Article(Integer id, Integer uid, Integer sortId, String keys, String title, String info, Date addtime, Date updatetime, Integer scancount, Integer ontop, Integer isdelete, String source, String item1, String item2, String content) {
        this.id = id;
        this.uid = uid;
        this.sortId = sortId;
        this.keys = keys;
        this.title = title;
        this.info = info;
        this.addtime = addtime;
        this.updatetime = updatetime;
        this.scancount = scancount;
        this.ontop = ontop;
        this.isdelete = isdelete;
        this.source = source;
        this.item1 = item1;
        this.item2 = item2;
        this.content = content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setScancount(Integer scancount) {
        this.scancount = scancount;
    }

    public void setOntop(Integer ontop) {
        this.ontop = ontop;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Article() {

    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.uid
     *
     * @return the value of article.uid
     *
     * @mbggenerated
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.sort_id
     *
     * @return the value of article.sort_id
     *
     * @mbggenerated
     */
    public Integer getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.keys
     *
     * @return the value of article.keys
     *
     * @mbggenerated
     */
    public String getKeys() {
        return keys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.info
     *
     * @return the value of article.info
     *
     * @mbggenerated
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.addtime
     *
     * @return the value of article.addtime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.updatetime
     *
     * @return the value of article.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.scancount
     *
     * @return the value of article.scancount
     *
     * @mbggenerated
     */
    public Integer getScancount() {
        return scancount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.ontop
     *
     * @return the value of article.ontop
     *
     * @mbggenerated
     */
    public Integer getOntop() {
        return ontop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.isdelete
     *
     * @return the value of article.isdelete
     *
     * @mbggenerated
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.source
     *
     * @return the value of article.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.item1
     *
     * @return the value of article.item1
     *
     * @mbggenerated
     */
    public String getItem1() {
        return item1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.item2
     *
     * @return the value of article.item2
     *
     * @mbggenerated
     */
    public String getItem2() {
        return item2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }
}