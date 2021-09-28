package co.micol.prj;

public abstract class Animal {// 하나이상의 abstract 메소드를 가지거나  몸체가 비어있는 클래스를 추상클래스라고한다.
	public abstract void run();
	
	public void sleep() { //{}를 가진것을 몸체가 있다고한다.
		System.out.println("잠을 잔다.");
	}
	
}
