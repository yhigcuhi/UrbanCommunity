package com.example.SpringbootGrapQL.Resolver;

import com.example.SpringbootGrapQL.Entities.user.Tasks;
import com.example.SpringbootGrapQL.Repository.TaskRepository;
import graphql.kickstart.tools.GraphQLResolver;

import java.util.List;

public class TaskResolver implements GraphQLResolver<Tasks> {

    private TaskRepository taskRepository;

    public TaskResolver(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> getTasks() {
        return taskRepository.findAll();
    }

}
