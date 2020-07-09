package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service.ExternalService;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.serviceFeign.TodoClient;
import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.serviceFeign.dto.TodoModel;

@Service
public class ExternalServiceImpl implements ExternalService {

	@Autowired
    TodoClient todoClient;
	
	@Override
	public List<TodoModel> getAll() {
		 return todoClient.getTodos();
	}
	
	

}
