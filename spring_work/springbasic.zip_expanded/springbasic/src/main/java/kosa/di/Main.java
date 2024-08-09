package kosa.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * 
		 * BeanFactory factory = // spring container (주방) 역할을 해준다. ->이 안에 bean들 (객체)존재
		 * new GenericXmlApplicationContext(resource);
		 */
		
//		ApplicationContext factory = 
//				new AnnotationConfigApplicationContext(Factory.class); //spring컨테이너 생성
		
		String configuration[]= {
				"applicationContext.xml",
				"commonConcern.xml"
		}; //스프링 컨테이너 생성
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext(configuration);
		
		// writeService안에 oracleDao를 넣어주고 service에 담음
		//Service service = (Service)factory.getBean("writeService");
		//이번엔 xml기반이 아닌 java기반
		
		//service.insertService();
		
		
		Kosa kosa = (Kosa)factory.getBean("kosaService");
		//kosa.insertService();
		kosa.list();
		// pointCut을 어떻게 정할지에 따라서 변화할 수 있다.
	}
	
	//모든 객체는 스프링 컨테이너 안에서 생성되고 불러온다.
}
