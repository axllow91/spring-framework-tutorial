package com.mrn.didemo;

import com.mrn.didemo.controllers.ConstructorInjectedController;
import com.mrn.didemo.controllers.MyController;
import com.mrn.didemo.controllers.PropertyInjectedController;
import com.mrn.didemo.controllers.SetterInjectedController;
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

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        //
        System.out.println(controller.hello());
    }
}
