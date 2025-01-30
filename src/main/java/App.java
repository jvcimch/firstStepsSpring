import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanFirst = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catFirst = (Cat) applicationContext.getBean("cat");
        Cat catSecond = (Cat) applicationContext.getBean("cat");
        boolean firstComapre = beanFirst == beanSecond;
        boolean  secondCompare= catFirst == catSecond;
        System.out.println(firstComapre);
        System.out.println(secondCompare);
    }
}