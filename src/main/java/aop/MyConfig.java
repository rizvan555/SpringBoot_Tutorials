package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration  // This annotation is required to enable Java-based configuration
@ComponentScan("aop")  // This annotation is required to enable component scanning
@EnableAspectJAutoProxy // This annotation is required to enable AOP
public class MyConfig {

}
