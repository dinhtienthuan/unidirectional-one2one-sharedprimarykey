package com.dinhtienthuan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dinhtienthuan.entity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Transactional(transactionManager = "hibernateTransactionManager")
    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<Person>();

        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Person");
        persons = query.list();

        return persons;
    }

    @Transactional(transactionManager = "hibernateTransactionManager")
    public void save(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
    }

}
