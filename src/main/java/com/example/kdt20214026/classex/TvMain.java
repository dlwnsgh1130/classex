package com.example.kdt20214026.classex;

public class TvMain {
	
	public static void main(String[] args) {
		
		Tv myTv = new Tv();
		
		//초기 필드 값 설정은 클래스(설계) private로 인해 직접 접근할 수 없기 때문에 setter 메서드 이용
		myTv.setPower(true);
		myTv.setChannel(7);
		myTv.setVolume(15);
		
		myTv.printStatus();
		myTv.channelUp();
		myTv.channelUp();
		myTv.channelUp();
		System.out.println("===");
		myTv.printStatus();
		myTv.setPower(false);
		System.out.println("===");
		myTv.printStatus();
	}

}
