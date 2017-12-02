package net.deckerego.docidx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DocIndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocIndexApplication.class, args);
	}
}
