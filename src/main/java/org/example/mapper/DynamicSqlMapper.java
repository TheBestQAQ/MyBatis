package org.example.mapper;

import org.example.pojo.Person;

import java.util.List;

public interface DynamicSqlMapper {

    List<Person> getPerson(Person person);

}
