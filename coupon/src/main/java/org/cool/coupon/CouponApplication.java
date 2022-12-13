package org.cool.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cool.coupon.dao")
public class CouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponApplication.class, args);
	}

}
