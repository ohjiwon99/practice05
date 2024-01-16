package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {


	public static void main(String[] args) {
    	
        //배열만들기
        Friend[] friendArray = new Friend[3];
        
        //상품만들기
        Scanner sc = new Scanner(System.in);
        
       // Friend f1 = new Friend("정우성","010-1111-1111","서울초등학교");
       // Friend f2 = new Friend("이효리","010-2222-2222","제주중학교");
        //Friend f3 = new Friend("유재석","010-3333-3333","강남고등학교");
        System.out.println("친구를 3명 등록해 주세요");
        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        for (int i = 0; i < friendArray.length; i++) {
        	
        	 System.out.println("이름: ");     
             String name=sc.nextLine();
             
             System.out.println("핸드폰: ");
             String hp=sc.nextLine();
             
             System.out.println("학교: ");
             String school=sc.nextLine();
             System.out.println("-------------------------------------------");
             friendArray[i] = new Friend(name, hp, school);
     		}

        //for문 끝
  

        
        // 친구정보 출력
        
		for (int i = 0; i < friendArray.length; i++) {
				friendArray[i].showInfo();
	
       }
		
		///으으으 다시 풀거얌 ㅡㅡ 
		sc.close();}}

        
    


