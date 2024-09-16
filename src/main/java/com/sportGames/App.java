package com.sportGames;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.lang.NonNull;

@SpringBootApplication
@EnableJpaRepositories("repository")
@EntityScan("domein")
@ComponentScan({ "service", "com.olympicGames" })
public class App implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void addViewControllers(@NonNull ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/login");
		registry.addViewController("/dashboard").setViewName("dashboard");
	}

	@Bean
	LocaleResolver localeResolver() {
		CookieLocaleResolver slr = new CookieLocaleResolver();
		slr.setDefaultLocale(Locale.ENGLISH);
		return slr;
	}
}