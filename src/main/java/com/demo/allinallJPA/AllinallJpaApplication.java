package com.demo.allinallJPA;

import com.demo.allinallJPA.domain.Course;
import com.demo.allinallJPA.repository.CourseRepo;
import com.demo.allinallJPA.repository.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AllinallJpaApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepo courseRepo;
	@Autowired
	private StudentRepo studentRepo;
	public static void main(String[] args) {
		SpringApplication.run(AllinallJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = courseRepo.findById(124L);
		String name = course.getName();
		logger.error(" -------- >>>>>>>>>",name);
		System.out.println(course.toString());
		studentRepo.savePass();
	}
}
