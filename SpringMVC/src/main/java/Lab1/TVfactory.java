package Lab1;

public class TVfactory {
	public static TV makeTV(String brand) {
		TV tv= null;
		
		if(brand.equals("sam")) {
			tv= new SamsungTV();
		}else if(brand.equals("lg")) {
			tv= new LgTV();			//new�� Tv�� �� �� ����
				}
		return tv;
		
	}
}
