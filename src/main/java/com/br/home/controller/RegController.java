package com.br.home.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegController {
	
	@GetMapping(value="/cadastro")
	public ResponseEntity<String> get(){
        return new ResponseEntity<>("Cadastro UP, carry on", HttpStatus.OK);
    }

}
