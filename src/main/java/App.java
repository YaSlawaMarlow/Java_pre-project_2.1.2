import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        HelloWorld bean3 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean3.getMessage());
        Cat catOne =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catOne.getValue());
        Cat catTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catTwo.getValue());
    }
}