import com.zyq.dao.UserDaoMysqlImpl;
import com.zyq.dao.UserDaoOracleImpl;
import com.zyq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 需要什么get什么
        UserService userService = (UserService) context.getBean("UserServiceImpl");

        userService.getUser();
    }
}
