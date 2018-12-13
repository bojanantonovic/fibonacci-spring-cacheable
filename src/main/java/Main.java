import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String... args) throws Exception {
        try (var context = new AnnotationConfigApplicationContext(CacheConfiguration.class, FibonacciService.class)) {
            var service = context.getBean(FibonacciService.class);

            System.out.println(service.fibonacci(10));
        }
    }
}
