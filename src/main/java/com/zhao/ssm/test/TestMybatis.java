package com.zhao.ssm.test;

/**
 * Created by zhao on 2017/3/29.
 */


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import com.zhao.ssm.bean.Book;
import com.zhao.ssm.bean.Person;
import com.zhao.ssm.bean.User;
import com.zhao.ssm.dao.PersonDao;
import com.zhao.ssm.dao.BookDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


public class TestMybatis
{
    private SqlSessionFactory sqlSessionFactory = null;
//单独测试mybaties需要对mybatis-config配置文件作一下处理，即需要使用mappers元素定位到接口，同一个接口只能注册一次，在整合spring的时候，也可以在spring的配置文件中标明。
    @Before
    public void init() throws IOException
    {
        String env="test";

        InputStream inputStream =  Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,env);
    }
    @Test
    public void testAdd2()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();
            Book book = new Book();
            BookDao bookDao = sqlSession.getMapper(BookDao.class);
            book.setName("west_visit_story333");
            book.setPrice(22.44);
            bookDao.insertBook(book);
            Book book1 = bookDao.getBook(1);
            System.out.println(book1.toString());
            sqlSession.commit();
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testAdd()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            Person person = new Person();
            person.setAge(23);
            person.setBirth(new Date());
            person.setName("小明12");
            person.setRegisterTime(new Date());
            person.setSalary(4500.55);

            PersonDao mapper = sqlSession.getMapper(PersonDao.class);
            mapper.add(person);

            System.out.println(person.getId());

            sqlSession.commit();
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testDelete()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            PersonDao mapper = sqlSession.getMapper(PersonDao.class);
            mapper.delete(3);
            sqlSession.commit();
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testUpdate()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            Person person = new Person();
            person.setAge(23);
            person.setBirth(new Date());
            person.setName("李明23212");
            person.setRegisterTime(new Date());
            person.setSalary(2500.55);
            person.setId(1);

            PersonDao mapper = sqlSession.getMapper(PersonDao.class);
            mapper.update(person);

            sqlSession.commit();
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testGetPersonById()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            PersonDao mapper = sqlSession.getMapper(PersonDao.class);
            Person person = mapper.getPersonById(1);
            System.out.println(person.toString());
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testGetAllPerson()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            PersonDao mapper = sqlSession.getMapper(PersonDao.class);
            List<Person> list = mapper.getAllPerson();
            for (Person person : list)
            {
                System.out.println(person.toString());
            }
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }
}
