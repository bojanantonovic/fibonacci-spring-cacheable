package fibonacci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class FibonacciService {

    @Autowired
    private FibonacciService self;

    @Cacheable("fibonacci")
    public long fibonacci(int index) {
        System.out.println("call of fibonacci with index "+index);

        if (index <= 2) {
            return 1L;
        } else {
            return self.fibonacci(index - 1) + self.fibonacci(index - 2);
        }
    }
}
