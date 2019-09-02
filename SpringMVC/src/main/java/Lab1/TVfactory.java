package Lab1;

public class TVfactory {
	public static TV makeTV(String brand) {
		TV tv= null;
		
		if(brand.equals("sam")) {
			tv= new SamsungTV();
		}else if(brand.equals("lg")) {
			tv= new LgTV();			//new는 Tv만 할 수 있음
				}
		return tv;
		
	}
}
