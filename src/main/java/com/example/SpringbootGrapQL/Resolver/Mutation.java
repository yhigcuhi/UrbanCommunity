package com.example.SpringbootGrapQL.Resolver;

import com.example.SpringbootGrapQL.Repository.TaskRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller // XXXResolver stereotype is like a @Controller
@RequiredArgsConstructor // for Let's use lombok. @RequiredArgsConstructor is make a final filed constructor
public class Mutation implements GraphQLMutationResolver {
    // Let's use lombok
//    private TaskRepository taskRepository;
//
//    public Mutation(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    private final TaskRepository taskRepository;
    // @RequiredArgsConstructor class annotation compile make ...
    // private final TaskRepository taskRepository;
    // public QueryResolver(final TaskRepository taskRepository) { this.taskRepository = taskRepository; }
}
