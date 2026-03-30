package com.example.kdt20214026.classex;
public class Tv {
	
	private boolean power;	//전원
	private int channel;	//채널
	private int volume;		//볼륨
	
	//접근자 설정 Getter/Setter
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//메서드
	public void printStatus() {
		String status = power ? "켜짐" : "꺼짐";
		
		System.out.println("Tv 전원: " + status);
		System.out.println("현재 채널: " + channel);
		System.out.println("현재 볼륨: " + volume);
		
	}
	
	public void channelUp() {
		channel++;
	}
	public void volumeUp() {
		volume++;
	}
	public void channelDown() {
		if(channel > 1) {
			channel--;
		}
	}
	
	
}






















