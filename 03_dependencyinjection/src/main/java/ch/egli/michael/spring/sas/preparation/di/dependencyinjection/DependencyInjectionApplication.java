package ch.egli.michael.spring.sas.preparation.di.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEachOrdered(System.out::println);

		Developer d = new Developer();
		d.do_compile();
	}


}
