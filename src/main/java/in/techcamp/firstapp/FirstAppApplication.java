package in.techcamp.firstapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("in.techcamp.firstapp")
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

}