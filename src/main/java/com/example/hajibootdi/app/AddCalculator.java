package com.example.hajibootdi.app;

import org.springframework.stereotype.Component;

@Component
public class AddCalculator implements Calculator {
	@Override
	public int calc(int a, int b) {
		// TODO 自動生成されたメソッド・スタブ
		return a + b;
	}

}
