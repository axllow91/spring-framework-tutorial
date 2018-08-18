package com.mrn.didemo.config;

import com.mrn.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

// Java configuration
@Configuration
// Annotation providing a convenient and declarative
// mechanism for adding a PropertySource to Spring's Environment.
// To be used in conjunction with @Configuration classes.
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    // value of the properties
    @Value("${mrn.username}")
    String user;

    @Value("${mrn.password}")
    String password;

    @Value("${mrn.dburl}")
    String url;

    // this will return the fake data source information
    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    // Allow us to autowire up by value
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        // configure the new place holder configuration
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
