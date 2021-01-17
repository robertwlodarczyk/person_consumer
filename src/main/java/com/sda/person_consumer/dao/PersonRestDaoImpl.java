package com.sda.person_consumer.dao;

import com.sda.person_consumer.person.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository

public class PersonRestDaoImpl implements PersonRestDao {

    @Override
    public List<Person> getAll() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Person[]> persons = restTemplate.getForEntity("http://localhost:8080/persons", Person[].class);
            Person[] people = persons.getBody();
            return Arrays.stream(people).collect(Collectors.toList());
        } catch (RestClientException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Person getById(int personId) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Person> personResponseEntity = restTemplate.getForEntity("http://localhost:8080/person/id/" + personId, Person.class);
        return personResponseEntity.getBody();
    }

    @Override
    public Person add(Person person) {
        return null;
    }

    @Override
    public Person modify(int personId, Person person) {
        return null;
    }

    @Override
    public Person remove(int personId) {
        return null;
    }
}
