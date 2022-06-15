package j13_다형성;

public class FactoryMain {

	public static void main(String[] args) {
		int i = 10;
		double d = i;

		//업캐스팅
		Factory smartPhoneFactory = new SmartPhoneFactory();
		Factory computerFactory = new ComputerFactory();
		//앞에 자료형이 중요
		
		smartPhoneFactory.start();
		computerFactory.start();
		
	}

}