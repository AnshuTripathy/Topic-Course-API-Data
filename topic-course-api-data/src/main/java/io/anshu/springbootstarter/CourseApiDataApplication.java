package io.anshu.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.anshu.springbootstarter.course.CourseRepository;
import io.anshu.springbootstarter.topic.TopicRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {TopicRepository.class,CourseRepository.class})
@ComponentScan
public class CourseApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}
}
