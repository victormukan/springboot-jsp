package demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import demo.dao.TaskRepository;
import demo.model.Task;

@Service
@Transactional
public class TaskService {
	
	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRespository) {
		this.taskRepository = taskRespository;
	}
	
	public List<Task> findAll() {
		List<Task> tasks = new ArrayList<>();
		for (Task task : taskRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	public Task findTask(int id) {
		return taskRepository.findOne(id);
	}
	public void save(Task task) {
		taskRepository.save(task);
	}
	
	public void delete(int id){
		taskRepository.delete(id);
	}
}
