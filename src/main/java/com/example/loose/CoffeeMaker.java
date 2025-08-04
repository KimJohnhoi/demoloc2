package com.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class CoffeeMaker {
	
	@Autowired 		//type 으로 체크, 1개만 가능
	//@Qualifier("dripCoffeeMachine") 
	// 구 문법: 같은 Component 가 두개 있으면 @Qualifier(이름) 으로 구분
	// 현재: @Primary
	private CoffeMachine coffeMachine;
	
	/* @Autowired 로 대체됨
	public void setCoffeeMachine(CoffeMachine coffeMachine) {
		this.coffeMachine = coffeMachine;
	}
	*/
	
	@PostConstruct
	public void makeCoffee() {
		System.out.println(coffeMachine.brew());	
	}
}