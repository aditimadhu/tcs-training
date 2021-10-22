package com.tcs.functional;

public class TestLambdaExpression {

	public static void main(String[] args) {
		
		test(new Calculator() {
			@Override
			public int operation(int x, int y) {
				return x - y;
			}
		});
		// new approach
		test((x, y) -> (x *y));
	}
	public static void test(Calculator c) {
		int result = c.operation(4, 3);
		System.out.println("Result = "+result);
	}

}