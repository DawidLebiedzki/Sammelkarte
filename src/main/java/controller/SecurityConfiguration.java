package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import repository.UserRepository;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository userRepository;

    // Roles
    private static final String ADMIN = "ADMIN";
    private static final String USER = "USER";

    //Add users and roles
    @Autowired
    public void configureAuth(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("dawid").password("123").roles(USER)
                .and()
                .withUser("anna").password("456").roles(USER, ADMIN);
    }

    // Permissions
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/index/").permitAll()
                .antMatchers("/user/**").hasRole(ADMIN)
                .antMatchers("/scrap/add-scrap").hasAnyRole(USER,ADMIN)
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/index")
                .and().logout().logoutSuccessUrl("/index");
    }


}
