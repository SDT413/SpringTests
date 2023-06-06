package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void itShouldAddNumbers() {
		// Given
		Calculator underTest = new Calculator();
		int numberOne = 20;
		int numberTwo = 30;
		int expected = numberOne + numberTwo;
		// When
		int actual = underTest.add(numberOne, numberTwo);
		// Then
		assertThat(actual).isEqualTo(expected);

	}
	class Calculator {
		public int add(int a, int b) {
			return a + b;
		}
	}

}
