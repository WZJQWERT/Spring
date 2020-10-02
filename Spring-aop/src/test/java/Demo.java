
import com.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Demo {
    @Test
    public void test(){
      ApplicationContext context=  new ClassPathXmlApplicationContext ("beans.xml");
          UserService userService = (UserService) context.getBean("userService");
          userService.add();


      }
      }

