import icu.insomniac.config.SpringConfig;
import icu.insomniac.service.JdbcTest;
import icu.insomniac.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml.bak");
//        context.registerShutdownHook();
//        UserService userService = context.getBean(UserService.class);
//        JdbcTest jdbcTest = context.getBean(JdbcTest.class);
//
//        System.out.println(userService.signIn("root", "kelex"));
//        System.out.println(userService.checkAccount("root"));
//        System.out.println(jdbcTest.toString());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.registerShutdownHook();
        UserService userService = context.getBean(UserService.class);
        JdbcTest jdbcTest = context.getBean(JdbcTest.class);

        System.out.println(userService.signIn("root", "kelex"));
        System.out.println(userService.checkAccount("root"));

        System.out.println(jdbcTest.toString());
    }
}
