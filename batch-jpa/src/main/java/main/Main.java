/**
 * 
 */
package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alain Narcisse SOBNGWI
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Starting ....");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/app-context-annotation.xml") ;
		System.out.println(appContext.getBean("dataSource", org.apache.tomcat.jdbc.pool.DataSource.class).toString()); ;
		System.out.println("Ending ...");
		
		
	}

}
