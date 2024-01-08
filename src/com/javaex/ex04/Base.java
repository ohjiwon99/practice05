package com.javaex.ex04;

public class Base {

	// 코드
	// private String day;
	// private String night;
	// private String afternoon;
	private String state;

	// 생성자
	public Base() {

	}

	public Base(String state) {
		this.state = state;
	}

	/*
	 * public Base(String day,String night,String afternoon) { this.day="낮";
	 * this.night="밤"; this.afternoon="오후"; }
	 */

	// 메소드
	// 코드작성할것
	public void service(String state) {
		if (state.equals("낮")) {
			System.out.println("낮에는 열심히 수업듣자");
		} else if (state.equals("밤")) {
			System.out.println("밤에는 숙면");
		} else {
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		}

		// 코드작성할것
	}

	public void day() {
		System.out.println("낮에는 열심히 수업듣자");

	}

	public void night() {
		System.out.println("밤에는 숙면");

		// 코드작성할것
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");

	}

}
