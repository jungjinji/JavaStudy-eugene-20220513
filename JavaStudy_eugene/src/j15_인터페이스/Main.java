package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();

		SmartPhone smartPhone = new SmartPhone(beamProjector);
		smartPhone.powerOn();
		smartPhone.powerOff();

	}

}