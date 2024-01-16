package com.javaex.ex10;

public class Book {

	// 필드
	//1. 멤버변수는 다음과 같으며 모든 멤버 변수는 초기값을 지정하지 않습니다
	private int bookno; // 번호
	private String title;// 제목
	private String author;// 작가
	private int stateCode;// 대여유무

	// 기본생성자
	private Book() {

	}

	// 디폴트 생성자
	public Book(int bookno, String title, String author) {

		this.bookno = bookno;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	// 메소드g/s
	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent() {
		if (this.stateCode == 1) {
			System.out.println(title + "이(가) 대여 됐습니다.");
			stateCode = 0;
		}

	}

	public void print() {
		if (this.stateCode == 0) {
			System.out.println(bookno + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + "대여중");
		} else {
			System.out.println(bookno + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + "재고있음");
		}
	

}}
