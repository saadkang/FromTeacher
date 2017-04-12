package oop.inheritance;

public class Son extends Father implements Human, Shape{
	
	public void sports(){
		System.out.println("He plays basketball");	
	}
	public void body() {
		System.out.println("It has a certain shape");		
	}
	public void breath() {
		System.out.println("Human needs oxygen");	
	}
}
