package com.javaex.ex09;

public class StringUtil {

	// 1 String 배열 타입의 파라미터를 받습니다.
	public static String concatString(String[] strArray) {
		// 2 인자로 받은 문자열 배열 요소를 하나의 문자열로 결합하고, 결과 문자열을 리턴 합니다.
		String result = " ";
		for (int i  = 0; i < strArray.length; i++) {
			result+=strArray[i];
		}

		return result;

		// 3. 주어진 클래스명과 메소드는 변경하지 않습니다

	}

}
