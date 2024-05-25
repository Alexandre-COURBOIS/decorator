package com.alexandre.decorator;

import com.alexandre.interfaces.Notifier;



public abstract class BaseDecorator implements Notifier {

    protected Notifier wrappee;

    public BaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
