package Lab2;

public class SamsungTV implements TV {

	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"������ �Ҵ�.");
	}

	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"������ ����"); //getSimpleName : �� Ŭ���� �̸��� ������. getName�� Ŭ���� ��α��� �� ������ 
	}

}
