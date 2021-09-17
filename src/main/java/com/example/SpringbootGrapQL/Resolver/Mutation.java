package com.example.SpringbootGrapQL.Resolver;

import com.example.SpringbootGrapQL.Repository.TaskRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;

public class Mutation implements GraphQLMutationResolver {

    private TaskRepository taskRepository;

    public Mutation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

}
