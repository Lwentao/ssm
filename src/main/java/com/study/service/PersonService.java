package com.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.bean.Person;
import com.study.dao.PersonDao;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	public List<Person> getAll(){
		return personDao.getAll();
	}
	
}
