package com.sda.person_consumer.dao;

import com.sda.person_consumer.person.Person;

import java.util.List;

public interface PersonRestDao {

    List<Person> getAll();

    Person getById(int personId);

    Person add(Person person);

    Person modify(int personId, Person person);

    Person remove(int personId);

}
