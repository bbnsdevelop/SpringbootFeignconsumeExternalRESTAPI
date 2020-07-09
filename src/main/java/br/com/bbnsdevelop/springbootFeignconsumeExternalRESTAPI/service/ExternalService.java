package br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.service;

import java.util.List;

import br.com.bbnsdevelop.springbootFeignconsumeExternalRESTAPI.serviceFeign.dto.TodoModel;

public interface ExternalService {
	
	List<TodoModel> getAll();

}
