package com.zhao.ssm.test;

/**
 * Created by zhao on 2017/3/29.
 */


import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import com.zhao.ssm.bean.Article;
import com.zhao.ssm.bean.User;
import com.zhao.ssm.dao.ArticleMapper;
import com.zhao.ssm.dao.UserDao;
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
            Article article = new Article();
            article.setAddtime(new Date());
            article.setSortId(1);
            article.setUid(1);
            article.setTitle("title");
            article.setContent("i am good");
            article.setInfo("info..");
            article.setIsdelete(1);
            article.setKeys("good");


            ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);
            mapper.insert(article);

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

            User user = new User();
            user.setBirthday(new Date());
            user.setUname("jim");
            user.setUpasswd("jjim");
            user.setAddress("lincheng_yageing");
            user.setIp("1.1.2.3");

            UserDao mapper = sqlSession.getMapper(UserDao.class);
            mapper.add(user);

            System.out.println(user.getUid());

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

            UserDao mapper = sqlSession.getMapper(UserDao.class);
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

            Article article = new Article();
            article.setAddtime(new Date());
            article.setSortId(1);
            article.setUid(1);
            article.setTitle("title______");
            article.setContent("i am good___");
            article.setInfo("info..");
            article.setIsdelete(1);
            article.setKeys("good");
            article.setId(1);
            ArticleMapper mapper1 = sqlSession.getMapper(ArticleMapper.class);

            mapper1.updateByPrimaryKeySelective(article);
            sqlSession.commit();
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testGetUserById()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            ArticleMapper mapper1 = sqlSession.getMapper(ArticleMapper.class);
            Article article = mapper1.selectByPrimaryKey(1);

            System.out.println(article.toString());
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }

    @Test
    public void testGetAllUser()
    {
        SqlSession sqlSession = null;
        try
        {
            sqlSession = sqlSessionFactory.openSession();

            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> list = mapper.getAll();
            for (User user : list)
            {
                System.out.println(user.toString());
            }
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            if(null !=sqlSession) sqlSession.close();
        }
    }
}
