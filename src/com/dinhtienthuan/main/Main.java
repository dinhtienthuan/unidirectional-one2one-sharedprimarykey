package com.dinhtienthuan.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dinhtienthuan.dao.PersonDAO;
import com.dinhtienthuan.entity.Address;
import com.dinhtienthuan.entity.Person;

public class Main {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonDAO personDAO = context.getBean(PersonDAO.class);

//        Address address = new Address();
//        address.setCity("Phu Yen");

        Person person = new Person();
//        person.setAddress(address);
        person.setName("Thinh");

        personDAO.save(person);

        List<Person> persons = personDAO.getAllPersons();

        for (Person p : persons) {
            System.out.println(p);
            System.out.println("\t" + p.getAddress());
        }
    }

}
