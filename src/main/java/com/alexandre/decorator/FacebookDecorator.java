package com.alexandre.decorator;

import com.alexandre.interfaces.Notifier;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebookMessage(message);
    }

    private void sendFacebookMessage(String message) {
        System.out.println("Message depuis Facebook : " + message);
    }
}
