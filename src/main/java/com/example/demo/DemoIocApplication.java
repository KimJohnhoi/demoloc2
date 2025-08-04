package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.example")
// 소스가 다른패키지에 있어서 검색이 안됐음 -> 검색 범위를 늘려준다
//@ImportResource("classpath:beans.xml"): xml 불러오기
public class DemoIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIocApplication.class, args);
	}
///
}
