package com.example.gccoffee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfiguration {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("hyoin"); // 스프링 시큐리티로 인증 기능을 붙이면 수정하자
    }

}
