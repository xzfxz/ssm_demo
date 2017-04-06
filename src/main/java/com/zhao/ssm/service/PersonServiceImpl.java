package com.zhao.ssm.service;

import com.zhao.ssm.bean.Person;
import com.zhao.ssm.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhao on 2017/3/29.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    public void savePerson(Person person) {
        personDao.add(person);
    }

    public void updatePerson(Person person) {
        personDao.update(person);
    }

    public Person getPerson(int id) {
        return personDao.getPersonById(id);
    }

    public List<Person> getAll() {
        return personDao.getAllPerson();
    }
}
