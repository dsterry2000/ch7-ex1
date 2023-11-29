package main.ch7ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Ch7Ex1Application {

	private static Logger logger = Logger.getLogger(Ch7Ex1Application.class.getName());
	public static void main(String[] args) {

		SpringApplication.run(Ch7Ex1Application.class, args);

		System.out.println();
		logger.info("Main application has started.");
		logger.info("Open a browser and access web pages stored in your resources file.");
	}

}
