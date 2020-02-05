package com.ddf.mainTeam;

import com.ddf.mainTeam.annotated.HelloWorldConfiguration;
import com.ddf.mainTeam.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
