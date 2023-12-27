package harryspring.helloboot;

import harryspring.config.MySpringBootApplication;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
@MySpringBootApplication
//@Configuration
//@ComponentScan
public class HellobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
		//MySpringApplication.run(HellobootApplication.class, args);

	}

}
