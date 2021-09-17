package com.example.SpringbootGrapQL.Resolver;

import com.example.SpringbootGrapQL.Entities.user.Tasks;
import com.example.SpringbootGrapQL.Repository.TaskRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Component
public class QueryResolver implements GraphQLQueryResolver {

    private TaskRepository taskRepository;

    public QueryResolver(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Tasks> findAllTasks() {
        return taskRepository.findAll();
    }

}
