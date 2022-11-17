package pojo.object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("unused")
public class Main{
	public static void main(String[] args) {
		// Implementation of POJO
		//Employee e=new Employee("Gaurav",12000,256);
		//e.setEname("Saurav");
		//System.out.println(e.toString());

		// Implementation of IOC (Inversion of control)
		/*
		 * Add jar file configure xml File use the spring IOC container eg. Application
		 * Context and Bean Factory
		 */
		System.out.println("IOC IN ACTION");
		ApplicationContext context=new ClassPathXmlApplicationContext("gaurav.xml");
		Employee e1=context.getBean("emp1",Employee.class);
		//Employee e2=context.getBean("emp2",Employee.class);

		/*
		 * Resource resource=new ClassPathResource("gaurav.xml"); BeanFactory
		 * factory=new XmlBeanFactory(resource);// SPRING CORE Employee
		 * e1=factory.getBean("emp1",Employee.class); Employee
		 * e2=factory.getBean("emp2",Employee.class);
		 */
		System.out.println(e1);
		//System.out.println(e2);
		ClassPathXmlApplicationContext cxt=(ClassPathXmlApplicationContext) context;
		cxt.close();
	}
}
