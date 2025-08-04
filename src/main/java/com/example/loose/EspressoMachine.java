package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EspressoMachine implements CoffeMachine {

	@Override
	public String brew() {
		return "에스프레소 머신으로 커피 추출하기";
	}
}
