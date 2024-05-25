package com.alexandre;

import com.alexandre.decorator.FacebookDecorator;
import com.alexandre.decorator.SMSDecorator;
import com.alexandre.decorator.SlackDecorator;
import com.alexandre.interfaces.Notifier;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new SimpleNotifier();

        notifier = new SMSDecorator(notifier);
        notifier = new FacebookDecorator(notifier);
        notifier = new SlackDecorator(notifier);

        notifier.send("Un même message pour trois types de diffusion :D !");
    }
}