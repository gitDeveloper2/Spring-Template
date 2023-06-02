package ke.co.mspace.ClientManager.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableWebSecurity

public class SecurityConfig {

    public static String[] AUTH_WHITELIST= { "/home", "/add-user","/resources/**"};

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(requests ->
            requests
                    .requestMatchers(AUTH_WHITELIST).permitAll()
                    .anyRequest()
                    .authenticated()
//                    .permitAll()
                    )
                
                .formLogin(form->{
                    try {
                        form
                                .loginPage("/login")
                                .permitAll()
                                .successHandler((request, response, authentication) -> {
                                          String username= authentication.getPrincipal().toString();
                                            response.sendRedirect("/home");
                                        }
                                        )
                                .and()
                                .logout()
                                .deleteCookies()
                                .invalidateHttpSession(true)
                                .logoutUrl("/logout")
                                .logoutSuccessHandler((request, response, authentication) ->
                                        response.sendRedirect("/login"));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                })

        .csrf().disable();


       return http.build();
    }

}
