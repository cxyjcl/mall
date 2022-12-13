package org.cool.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cool.ware.dao")
public class WareApplication {

	public static void main(String[] args) {
		SpringApplication.run(WareApplication.class, args);
	}

}
