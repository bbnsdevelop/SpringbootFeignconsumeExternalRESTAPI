package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.ExternalService;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.serviceFeign.dto.TodoModel;

@RestController
@RequestMapping("/todos-internal")
public class TodoController {
	
	@Autowired
	private ExternalService service;
	
	@GetMapping
	public ResponseEntity<List<TodoModel>> getTodos(){		
		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}

}
