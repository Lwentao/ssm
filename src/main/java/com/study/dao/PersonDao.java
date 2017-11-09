package com.study.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.bean.Person;

@Repository
public interface PersonDao {

	public Person getPersonById(int id);
	
	public List<Person> getAll();
}
