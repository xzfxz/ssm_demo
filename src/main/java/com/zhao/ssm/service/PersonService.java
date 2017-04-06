package com.zhao.ssm.service;

import com.zhao.ssm.bean.Person;

import java.util.List;

/**
 * Created by zhao on 2017/3/29.
 */
public interface PersonService {
    public void savePerson(Person person);

    public void updatePerson(Person person);

    public Person getPerson(int id);

    public List<Person> getAll();
}
