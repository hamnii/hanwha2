package Lab4;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Lab4Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context	=new ClassPathXmlApplicationContext("lab4.xml"); //abc.xml�� �о���ڴٴ� �� 

		Car c= context.getBean("car",Car.class);
		System.out.println(c); 
		
		
		  People p = context.getBean("people",People.class); //people classŸ���� people
		  
		  System.out.println(p);
		 
	
	}

}

