package com.mrn.didemo;

import com.mrn.didemo.controllers.MyController;
import com.mrn.didemo.examplebeans.FakeDataSource;
import com.mrn.didemo.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// so this annotation is saying that will do a scanning
// from this class down to all classes from all packages from all over the project
@SpringBootApplication(scanBasePackages = {"com.mrn.didemo.services", "com.mrn.didemo"})

public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
//
//        //
//        System.out.println(controller.hello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());

        FakeJMSBroker fakeJMSBroker = ctx.getBean(FakeJMSBroker.class);
        System.out.println(fakeJMSBroker.getUser());
    }
}
