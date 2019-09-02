package Lab3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context	=new ClassPathXmlApplicationContext("lab3.xml"); //abc.xml을 읽어오겠다는 뜻 

		Car c= context.getBean("car",Car.class);

		System.out.println(c.model);
		System.out.println(c.price);
		
		People p = context.getBean("people",People.class); //people class타입의 people
		/*
		 * System.out.println(p); People p2 = context.getBean("people",People.class);
		 * //people class타입의 people System.out.println(p2); System.out.println(p==p2);
		 * System.out.println(System.identityHashCode(p));
		 * System.out.println(System.identityHashCode(p2));
		 */
		
	System.out.println(p.name);
	System.out.println(p.phone);
	System.out.println(p.car);
	System.out.println(p.major);

	
	System.out.println(p.licenses);
	}

}

