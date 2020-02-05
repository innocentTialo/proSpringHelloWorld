package com.ddf.mainTeam.annotated;

import com.ddf.mainTeam.decoupled.HelloWorldMessageProvider;
import com.ddf.mainTeam.decoupled.MessageProvider;
import com.ddf.mainTeam.decoupled.MessageRenderer;
import com.ddf.mainTeam.decoupled.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
