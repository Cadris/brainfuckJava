package com.sayan.brainfuck.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.brainfuck.beans.BfCompiler;

@RestController
@RequestMapping(value = "/rest/api")
public class RestControllers {

	@Autowired
	BfCompiler compiler;
	
	@GetMapping("/wordToCode")
	public String test(@RequestParam String str) {
		return compiler.compile(str);
	}
}
