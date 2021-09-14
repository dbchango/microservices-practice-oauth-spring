package espe.edu.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CursosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursosApplication.class, args);
    }

}
