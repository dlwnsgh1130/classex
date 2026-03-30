package com.example.kdt20214026.control;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam2 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 사과 농장에서 사과가 567개 수확
		 * 1박스당 50개로 정했을 때 몇 박스이며 나머지는 몇 개인지 구하는 프로그램
		 */
		int apple = 567, box = 50;
		int result = apple / box;
		int reminder = apple % box;
		
		System.out.println("사과 박스 수: " + result);
		System.out.println("남은 사과 수: " + reminder);
		
		/*
		 * 박스당 5000원이고 낱개는 1200원인 경우 사과 판매액을 구하는 프로그램
		 */
		int price = 1200, boxPrice = 5000;
		int total = (result * boxPrice) + (reminder * price);
		DecimalFormat df = new DecimalFormat("#,##0원");
		System.out.println("총 판매액: " + df.format(total));
		
		System.out.println("=========");
		System.out.println("구매하려는 사과의 수를 입력하세요: ");
		int item = sc.nextInt();
		int resultItem = item / box;
		int reminderItem = item % box;
		total = (resultItem * boxPrice) + (reminderItem * price);
		
		// 구매한 사과의 수는 ?이며 박스의 수는 ? 남는 사과의 수는 ?입니다.
		System.out.printf("입력한 사과 수는 %d이며 박스 수는 %d, 남는 사과 수는 %d입니다.\n", item, resultItem, reminderItem);
		System.out.printf("가격은 %,d원입니다.", total);
	}


}
