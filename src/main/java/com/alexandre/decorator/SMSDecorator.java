package com.alexandre.decorator;

import com.alexandre.interfaces.Notifier;

public class SMSDecorator extends BaseDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        sendSMS(message);
        super.send(message);
    }

    private void sendSMS(String message) {
        System.out.println("J'envoie un SMS: " + message);
    }
}
