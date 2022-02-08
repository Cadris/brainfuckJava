package com.sayan.brainfuck.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.brainfuck.services.BfGenarate;
import com.sayan.brainfuck.services.Container;
import com.sayan.brainfuck.services.Line;

@RestController
@RequestMapping(value = "/rest/api")
public class RestControllers {

	@Autowired
	BfGenarate genarator;
	
	@GetMapping("/wordToCode")
	public String test(@RequestParam String str) {
		return genarator.compile(str);
	}
	
//	@RequestMapping(value = "/ab/greeting", method=RequestMethod.POST,headers = "Accept=*/*",produces = "application/json", consumes="application/json")
//	public String greetingSubmit(@RequestBody Person p1) {
//	    return "result";
//	}
	
	@GetMapping(value = "/test", produces = "application/json", consumes = "application/json")
	public Container test(@RequestBody Line line) {
		return new Container(line.getStr(), genarator.compile(line.getStr()));
	}
}
