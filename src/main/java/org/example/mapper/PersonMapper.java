package org.example.mapper;

import org.example.pojo.Person;

import java.util.List;

public interface PersonMapper {
    void insertPerson(Person person);
    void updataPerson();
    void deletePerson();
    Person getPersonById(int id);
    List<Person> getAllPerson();
}
