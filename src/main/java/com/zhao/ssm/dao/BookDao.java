package com.zhao.ssm.dao;

import com.zhao.ssm.bean.Book;
import com.zhao.ssm.bean.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by zhao on 2017/3/27.
 */
public interface BookDao {
    @Insert("insert into book(name,price) values(#{name},#{price})")
    void insertBook(Book book);
    @Delete("delete from book where id = #{id}")
    void deleteBook(@Param("id") int id);
    @Update("update book set name=#{name},price=#{price} where id = #{id}")
    void updateBook(User user);
    @Select("select * from book where id=#{id}")
    Book getBook(int id);
}
