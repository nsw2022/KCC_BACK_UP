package com.kcc.security1.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

//시큐리티와 관련된 설정 파일의 역할
@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SecurityConfig {

    private static final String[] WHITE_LIST = {
            "/",
            "/common/**",
            "/WEB-INF/views/**",
            "/joinForm",
            "/join",
            "/loginForm",
            "/h2-console/**",
    };

    @Bean
    public BCryptPasswordEncoder encodePwd() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable); // CSRF 보호 비활성화
        http.authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(WHITE_LIST).permitAll() // 화이트리스트 URL은 모두 허용
                        .requestMatchers("/manager/**").hasAnyRole("MANAGER", "ADMIN")  // 자동으로 ROLE_ 을 붙혀서 나옴
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers(PathRequest.toH2Console()).permitAll() // h2는 모드 허용
                        .anyRequest().authenticated()
                ) // 그 외 URL은 인증 필요
                .csrf(csrf-> csrf.ignoringRequestMatchers(PathRequest.toH2Console()))
                .headers(headers->headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin))
                .formLogin(form -> form
                        .loginPage("/loginForm") // 사용자 정의 로그인 페이지 설정
                        .loginProcessingUrl("/login") // 사용자 정의 로그인 매핑 설정
                        .defaultSuccessUrl("/main") // 로그인 후 갈 페이지 설정
                );
        return http.build();
    }
}
