package co.com.rico.microservice.resolveEnigmaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "co.com.rico.microservice.resolveEnigmaApi", "co.com.rico.microservice.resolveEnigmaApi.api" , "co.com.rico.microservice.resolveEnigmaApi.config"})
public class Swagger2SpringBoot{
    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

}
