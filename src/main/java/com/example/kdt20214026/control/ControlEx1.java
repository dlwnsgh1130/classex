package com.example.kdt20214026.control;

import java.util.Scanner;
public class ControlEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int 나이 = 10;
		if (나이 >= 19) {
			System.out.println("성인 인증 완료");
		}
		
		// 이름 입력
		System.out.println("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("안녕하세요, " + name + "님");
		
		// 나이 입력을 받아 성인 인증
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		if(age >= 19) {
			System.out.println("성인 인증 완료");
		} else {
			System.out.println("인증 불가");
		}
		
		// 로그인 상태 확인
		System.out.println("로그인 상태 입력하세요. true/false");
		boolean isLogin = sc.nextBoolean();
		if(isLogin) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("로그인 불가");
		}
		
		// 숫자를 입력 받아 짝수/홀수 출력
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		/* switch 문
			switch(변수) {
				case 값1:
					실행문;
					break;
				case 값2:
					실행문;
					break;
				default:	
					실행문;
			}
		*/
		System.out.println("요일(1~7)을 입력하세요 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;	
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;	
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		//월을 입력 받아 계절 출력
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("겨울");
				break;
		
			default:
				System.out.println("잘못된 입력입니다.");
				
		}
		sc.close();
	}
}












