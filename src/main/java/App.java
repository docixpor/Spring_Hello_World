import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            HelloWorld helloWorld1 = context.getBean("helloWorld", HelloWorld.class);
            HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);

            Cat cat1 = context.getBean("cat", Cat.class);
            Cat cat2 = context.getBean("cat", Cat.class);

            System.out.println(helloWorld1 == helloWorld2);
            System.out.println(cat1 == cat2);
        }
    }
}