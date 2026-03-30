package com.example.kdt20214026.classex;

public class Person {
	// 필드(멤버 변수)
	String name;
	int age;
	
	// 생성자
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("안녕하세요? " + age + "살 " + name + "입니다.");
	}
	
	

}
