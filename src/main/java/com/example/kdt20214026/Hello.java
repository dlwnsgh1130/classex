package com.example.kdt20214026;



//Hello 클래스 선언
public class Hello {
	
	//print() 메서드
	public void print(String name, int age) {
		System.out.println("my name is " + name + " my age is " + age);
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Hello hello = new Hello();//new 키워드를 사용해 객체 생성
		hello.print("Java",20);
		hello.print("Java",20);
		hello.print("Java",20);
		
		
	}

}
