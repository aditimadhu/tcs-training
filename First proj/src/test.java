import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] ar) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ID id=(ID)context.getBean("i1");
		id.display();
		((ClassPathXmlApplicationContext)context).close();
	}
}
