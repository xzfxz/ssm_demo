package com.zhao.ssm.test;

/**
 * Created by zhao on 2017/3/29.
 */
import com.zhao.ssm.bean.Person;
import com.zhao.ssm.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-*.xml" })
public class TestSpring {

    @Autowired
    private PersonService personService;

    @Test
    public void testPerson(){
        Person person = new Person();
        person.setAge(22);
        person.setName("zzzz");
        person.setBirth(new Date());
        person.setRegisterTime(new Date());
        personService.savePerson(person);

    }
}