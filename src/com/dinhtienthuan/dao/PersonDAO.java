package com.dinhtienthuan.dao;

import java.util.List;

import com.dinhtienthuan.entity.Person;

public interface PersonDAO {
    public List<Person> getAllPersons();

    public void save(Person person);
}
