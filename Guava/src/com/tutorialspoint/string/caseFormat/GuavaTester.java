package com.tutorialspoint.string.caseFormat;

import com.google.common.base.CaseFormat;

public class GuavaTester {

	public static void main(String[] args) {
		GuavaTester guavaTester = new GuavaTester();
		guavaTester.testCaseFormat();

	}
	
	private void testCaseFormat() {
		System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
		System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));
		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));
	}

}
