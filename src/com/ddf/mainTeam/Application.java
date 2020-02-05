package com.ddf.mainTeam;

import com.ddf.mainTeam.decoupled.*;

public class Application {
    public static void main(String... args) {
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}

class HelloWorldDecoupledWithFactory {
    public static void main(String[] args) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getRenderer();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
