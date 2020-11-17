package Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyContext {
    @Bean
    public ClassA getA(){
        return new ClassA();
    }

    @Bean
    public ClassB getB(){
        return new ClassB();
    }
}
