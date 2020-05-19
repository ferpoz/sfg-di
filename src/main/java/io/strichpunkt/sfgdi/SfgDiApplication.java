package io.strichpunkt.sfgdi;

import io.strichpunkt.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
        SpringApplication.run(SfgDiApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");
        
        String greeting = myController.SayHello();
        
        System.out.println(greeting);
	}

}
