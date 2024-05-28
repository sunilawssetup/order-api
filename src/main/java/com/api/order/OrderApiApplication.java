package com.api.order;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "ORDER-API",
				summary = "It is a swiggy Order",
				description = "here user can book the order",
				contact = @Contact(
				name = "Sunil Mane",
				email = "manesunil069@gmail.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://localhost:/order/9090"
				)
		),
		externalDocs = @ExternalDocumentation(
				url = "http://localhost:9093/swagger-ui/index.html",
				description = "swagger api documetion"
		)
)
public class OrderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApiApplication.class, args);
	}

}
