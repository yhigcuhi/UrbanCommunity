package com.example.SpringbootGrapQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootGrapQlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootGrapQlApplication.class, args);
	}

// XXXResolver は @Beanでの登録を しなくて大丈夫です. 実行してエラーになったのならば XXXResolver以外が間違っています
//	@Bean
//	public TaskResolver taskResolver(TaskRepository taskRepository) {
//		return new TaskResolver(taskRepository);
//	}
//
////	@Bean
////	public QueryResolver query(TaskRepository taskRepository) {
////		return new QueryResolver(taskRepository);
////	}
//
//	@Bean
//	public Mutation mutation(TaskRepository taskRepository) {
//		return new Mutation(taskRepository);
//	}

}

