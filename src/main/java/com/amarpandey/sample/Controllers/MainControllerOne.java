package com.amarpandey.sample.Controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainControllerOne {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String index() {
		return "index.html";
	}

	@RequestMapping(value = "/testOne", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String testQueryOne() {
		return "../app/testQuery.html";
	}

	@GetMapping(value = "/testTwo", produces = MediaType.APPLICATION_JSON_VALUE)
	public String testQueryTwo() {
		return "../app/testQuery.html";
	}

	@PostMapping(value = "/testThree", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String testQueryThree() {
		return "../app/testQuery.html";
	}
}