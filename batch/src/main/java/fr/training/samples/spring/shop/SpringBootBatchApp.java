package fr.training.samples.spring.shop;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan(basePackages = { "fr.training.samples.spring.shop" })
public class SpringBootBatchApp {

	public static void main(final String[] args) {
		final ApplicationContext context = SpringApplication.run(SpringBootBatchApp.class, args);
		System.exit(SpringApplication.exit(context));
	}

}