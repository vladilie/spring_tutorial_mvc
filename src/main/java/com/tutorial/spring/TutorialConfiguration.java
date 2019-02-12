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
        return readPropertiesFile("src/main/resources/countries.properties");
    }

    @Bean
    public Properties languages() throws IOException {
        return readPropertiesFile("src/main/resources/languages.properties");
    }

    @Bean
    public Properties operatingSystems() throws IOException {
        return readPropertiesFile("src/main/resources/operating-systems.properties");
    }

    // define a bean for ViewResolver
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }

    private Properties readPropertiesFile(String location) throws IOException {
        Properties countries = new Properties();
        countries.load(new FileUrlResource(location).getInputStream());
        return countries;
    }

}