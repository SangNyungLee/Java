package java_interface;

/* //인터페이스의 특징
 * 1. 추상화 메서드를 선언하여 상속받은 클래스에서 사용하게 한다.
 * 2. 다중상속 : 하나의 인터페이스는 여러 인터페이스를 상속받을 수 있다.
 * 하나의 인터페이스를 통해 여러 클래스에서 공통의 동작을 정의할 수 있고
 * 각 클래스는 그 동작을 자신의 방식대로 구현할 수 있다.
 * 3. 
 */
public interface GameConsole {
	void up();
	void down();
	void right();
	void left();
}
