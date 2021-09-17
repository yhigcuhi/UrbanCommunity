package com.example.SpringbootGrapQL.Resolver;

import com.example.SpringbootGrapQL.Entities.user.Task;
import com.example.SpringbootGrapQL.Repository.TaskRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

//@Slf4j
//@Component
@Controller // XXXResolver stereotype is like a @Controller
@RequiredArgsConstructor // for Let's use lombok. @RequiredArgsConstructor is make a final filed constructor
public class QueryResolver implements GraphQLQueryResolver {
    // Let's use lombok
//    private TaskRepository taskRepository;
//
//    public QueryResolver(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    private final TaskRepository taskRepository;
    // @RequiredArgsConstructor class annotation compile make ...
    // private final TaskRepository taskRepository;
//     public QueryResolver(final TaskRepository taskRepository) { this.taskRepository = taskRepository; }

    // Query.graphql type Query findAllTasks is not define,
    // public List<Task> findAllTasks() { return taskRepository.findAll(); }
    public List<Task> getTasks() { return taskRepository.findAll(); }

    // I think more better ... make a service class. @Controller <-> @Service <-> @Repository flow
    // private final TaskService taskService; // TaskService class is... @Service public class TaskService { private final TaskRepository repository;
    // public List<Task> getTasks() { return taskService.getAll(); } // TaskService class method is... public List<Task> getAll() { return repository.findAll(); }
}
