package telran.aws;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerKinesisAppl {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerKinesisAppl.class, args);
	}
	
	
	@Bean
	Consumer<String> consumerMessages() {
		return message -> System.out.println(message);
	}
	

}
