package Lab2;

public class LgTV implements TV {

	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"전원을 켠다.");
	}

	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"전원을 끈다"); //getSimpleName : 딱 클래스 이름만 가져옴. getName은 클래스 경로까지 다 가져옴 
	}

}
