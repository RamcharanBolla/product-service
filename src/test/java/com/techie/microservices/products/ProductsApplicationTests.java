package com.techie.microservices.products;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ProductsApplicationTests {

	@Test
	void contextLoads() {
	}

}
