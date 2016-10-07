/**
 * 
 */
package net.ddns.sabi11.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Sabi
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate bean container, 
		* it can be fetched context from library, 
		* shown as above import statement.
		* The new FileSystemXmlApplication creates spring bean container
		* so the application can use the xml content, called beans.xml
		* That xml file points to the Person java class. 
		*/
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/net/ddns/sabi11/spring/app/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("net/ddns/sabi11/spring/app/beans/beans.xml");
		
		
		//Rather instantiate the Person class, the context container is linked the Person class
		Person person1 = (Person)context.getBean("person");
		
		person1.speak();
		
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();

	}

}
