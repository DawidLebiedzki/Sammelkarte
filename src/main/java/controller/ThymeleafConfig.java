package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;

@Controller
public class ThymeleafConfig {

    @Bean
    public SpringSecurityDialect springSecurityDialect(){
        return new SpringSecurityDialect();
    }
}
