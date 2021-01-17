package com.sda.person_consumer;

import com.sda.person_consumer.dao.PersonRestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProgStarter implements CommandLineRunner {

    PersonRestDao personRestDao;

    @Autowired
    public void setPersonRestDao(PersonRestDao personRestDao) {
        this.personRestDao = personRestDao;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(personRestDao.getById(5));

    }
}
