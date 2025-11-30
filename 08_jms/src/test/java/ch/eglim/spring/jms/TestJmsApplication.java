package ch.eglim.spring.jms;

import org.springframework.boot.SpringApplication;

public class TestJmsApplication {

	public static void main(String[] args) {
		SpringApplication.from(JmsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
