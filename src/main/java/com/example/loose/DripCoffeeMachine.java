package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //type 이 같은 두 Component 에 우선 순위를 제공한다.
public class DripCoffeeMachine implements CoffeMachine {

	@Override
	public String brew() {
		return "드립커피 머신으로 커피 추출하기";
	}
}