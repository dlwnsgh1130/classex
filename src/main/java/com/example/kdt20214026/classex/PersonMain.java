package com.example.kdt20214026.classex;

public class PersonMain {
	
	public static void main(String[] args) {
		
		//객체 생성해서 참조 p1에 대입
		Person p1 = new Person("한라봉", 20);
		Person p2 = new Person("귤", 22);
		Person p3 = new Person("천혜향", 24);
		
		p1.introduce();
		p2.introduce();
		p3.introduce();
	}

}
