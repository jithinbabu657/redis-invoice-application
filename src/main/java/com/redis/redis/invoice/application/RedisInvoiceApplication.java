package com.redis.redis.invoice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisInvoiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisInvoiceApplication.class, args);
	}

}
