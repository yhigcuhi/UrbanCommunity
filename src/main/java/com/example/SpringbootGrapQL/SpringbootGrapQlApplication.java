package com.example.SpringbootGrapQL;

import com.example.SpringbootGrapQL.Repository.TaskRepository;
import com.example.SpringbootGrapQL.Resolver.Mutation;
import com.example.SpringbootGrapQL.Resolver.QueryResolver;
import com.example.SpringbootGrapQL.Resolver.TaskResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootGrapQlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootGrapQlApplication.class, args);
	}

	@Bean
	public TaskResolver taskResolver(TaskRepository taskRepository) {
		return new TaskResolver(taskRepository);
	}

//	@Bean
//	public QueryResolver query(TaskRepository taskRepository) {
//		return new QueryResolver(taskRepository);
//	}

	@Bean
	public Mutation mutation(TaskRepository taskRepository) {
		return new Mutation(taskRepository);
	}

}

