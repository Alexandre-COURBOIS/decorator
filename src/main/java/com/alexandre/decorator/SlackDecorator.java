package com.alexandre.decorator;

import com.alexandre.interfaces.Notifier;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Message depuis Slack : " + message);
    }
}
