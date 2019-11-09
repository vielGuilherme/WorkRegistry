package com.br.home.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	
	@GetMapping(value="/home")
	public ResponseEntity<String> get(){
        return new ResponseEntity<>("UP", HttpStatus.OK);
    }
}
