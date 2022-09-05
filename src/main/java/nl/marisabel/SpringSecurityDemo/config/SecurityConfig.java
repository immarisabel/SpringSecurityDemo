package nl.marisabel.SpringSecurityDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
        // should not use this in a prod app => BCryptPasswordEncoder
    }

    // As of now WebSecurityConfigurerAdapter is deprecated in newer spring security version and
    // the way to go about it is creating Bean for WebSecurityCustomizer.
    // Below Bean in your security configuration class can do the trick.

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/h2-console/**");
    }
}
