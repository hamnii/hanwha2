package Lab1;

public class TvUser {

	public static void main(String[] args) {
		//SamsungTV tv= new SamsungTV();
		TV tv= TVfactory.makeTV("lg");
		tv.powerOn();
		tv.powerOff();
		
		
		
		
	}

}
