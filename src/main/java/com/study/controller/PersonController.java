package com.study.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.bean.Person;
import com.study.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@RequestMapping("/getall")
	public String getAllPerson(Map<String, Object> allperson) {
		List<Person> all = personService.getAll();
		allperson.put("allperson", all);
		return "test";
	}
}
