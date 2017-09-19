package demo.dao;

import org.springframework.data.repository.CrudRepository;

import demo.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
	

}
