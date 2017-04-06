package com.zhao.ssm.dao;

import com.zhao.ssm.bean.Person;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhao on 2017/3/29.
 */
@Repository(value = "personDao")
public interface PersonDao
{
    //@Insert("insert into tbl_person(name,salary,birth,registerTime) values(#{name},#{salary},#{birth},#{registerTime});")
    public void add(Person person);
    public void delete(Integer id);
    public void update(Person person);
    public Person getPersonById(Integer id);
    public List<Person> getAllPerson();
}
