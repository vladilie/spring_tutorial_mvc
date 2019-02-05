package com.tutorial.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileUrlResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.tutorial.spring")
public class TutorialConfiguration {

    @Bean
    public Properties countries() throws IOException {
        Properties countries = new Properties();
        countries.load(new FileUrlResource("src/main/resources/countries.properties").getInputStream());
        return countries;
    }

    @Bean
    public StudentView studentView() {
        return new StudentView();
    }

    // define a bean for ViewResolver
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }


}