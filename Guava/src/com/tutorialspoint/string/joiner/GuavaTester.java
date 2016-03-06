package com.tutorialspoint.string.joiner;

import java.util.Arrays;

import com.google.common.base.Joiner;

public class GuavaTester {

	public static void main(String[] args) {
		GuavaTester guavaTester = new GuavaTester();
		guavaTester.testJoiner();

	}
	
	private void testJoiner() {
		System.out.println(Joiner.on(";")
				.skipNulls()
				.join(Arrays.asList(1,2,3,4,5,null,6))
				);
	}

}
