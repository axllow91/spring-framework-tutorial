package com.mrn.didemo.config;

import com.mrn.didemo.examplebeans.FakeDataSource;
import com.mrn.didemo.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

// Java configuration
@Configuration
// Annotation providing a convenient and declarative
// mechanism for adding a PropertySource to Spring's Environment.
// To be used in conjunction with @Configuration classes.
// we use curly braces for multiple property sources {"1", "2",...}
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})

@PropertySources({ // available from spring 4.0
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    // value of the properties
    @Value("${mrn.username}")
    String user;

    @Value("${mrn.jms.user}")
    String jmsUser;

    @Value("${mrn.password}")
    String password;

    @Value("${mrn.jms.pass}")
    String jmsPass;

    @Value("${mrn.dburl}")
    String url;

    @Value("${mrn.jms.url}")
    String jsmUrl;

    // this will return the fake data source information
    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSDataSource() {
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUser(jmsUser);
        fakeJMSBroker.setPass(jmsPass);
        fakeJMSBroker.setUrl(jsmUrl);

        return fakeJMSBroker;
    }

    // Allow us to autowire up by value
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        // configure the new place holder configuration
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
