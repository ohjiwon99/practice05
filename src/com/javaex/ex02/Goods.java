package com.javaex.ex02;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//기본생성자
	public Goods() {
	}
	
	//특정생성자
	public Goods(String name, int proce) {
		this.name=name;
		this.price= price;
		
		
	}
	//메소드-g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    //일반 메소드
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:"+price);
			}

	
	
}




