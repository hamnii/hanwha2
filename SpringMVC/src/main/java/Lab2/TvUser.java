package Lab2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		//SamsungTV tv= new SamsungTV();
		
	ClassPathXmlApplicationContext context	=new ClassPathXmlApplicationContext("lab2.xml"); //abc.xml을 읽어오겠다는 뜻 
		
		TV tv= (TV)context.getBean("stv");
		tv.powerOn();
		tv.powerOff();
		
		
		
		
		
	}

}
