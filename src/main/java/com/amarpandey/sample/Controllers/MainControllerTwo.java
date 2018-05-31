package com.amarpandey.sample.Controllers;

import java.util.HashMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllerTwo {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> index() {
		return null;
	}

	@RequestMapping(value = "/testOne", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object>testQueryOne() {
		return null;
	}

	@GetMapping(value = "/testTwo", produces = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> testQueryTwo() {
		return null;
	}

	@PostMapping(value = "/testThree", consumes = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<String, Object> testQueryThree() {
		return null;
	}
	
}
