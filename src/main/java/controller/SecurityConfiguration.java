package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;


    //Authentication
    @Autowired
    public void configureAuth(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }

    // Permissions
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/index/").permitAll()
                .antMatchers("/user/**").access("hasRole('ADMIN')")
                .antMatchers("/scrap/**").access("hasAnyRole('USER', 'ADMIN')")
                .and().formLogin().loginPage("/login")
                .usernameParameter("username").passwordParameter("password")
                .defaultSuccessUrl("/index")
                .and().logout().logoutSuccessUrl("/index")
                .and()
                .exceptionHandling().accessDeniedPage("/403")
                .and()
                .csrf();
    }

    @Bean(name = "userDetailsService")
    public UserDetailsService userDetailsService(){
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(dataSource);
        jdbcImpl.setUsersByUsernameQuery(
                "select username,password,enabled from users where username=?"
        );
        jdbcImpl.setAuthoritiesByUsernameQuery(
                "select username, role from user_roles where username=?"
        );
        return jdbcImpl;
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
